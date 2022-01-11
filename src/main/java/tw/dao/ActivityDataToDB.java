package tw.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import tw.util.HibernateUtil;
import tw.model.ActivityBean;

public class ActivityDataToDB {

	public static void main(String[] args){

		JsonParser parser = new JsonParser();
		try {
			JsonObject object=(JsonObject) parser.parse(new FileReader("C:\\Users\\lyang\\Downloads\\activity_C_f.json"));
			String dataStr = object.toString();
			String jsonStr = dataStr.replace("{\"XML_Head\":", "").replace("}}}", "}}");

			JsonParser jsonParser = new JsonParser();
	        JsonObject jsonObject = jsonParser.parse(jsonStr).getAsJsonObject();
	        
	        
			String Updatetime = jsonObject.get("Updatetime").getAsString();
			String UpdatetimeFormat = Updatetime.substring(0,10);
			System.out.println(UpdatetimeFormat);

			JsonObject Infos = jsonObject.get("Infos").getAsJsonObject();
			String InfosStr = Infos.toString().replace("{\"Info\":", "").replace("]}","]");
	        JsonArray jsonArray = jsonParser.parse(InfosStr).getAsJsonArray();
	        
	        SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			ActivityBean activity = new ActivityBean();

			for (int i = 0; i < jsonArray.size(); i++) {
				
				JsonObject jsonObject1 = jsonArray.get(i).getAsJsonObject();
				activity.setId(jsonObject1.get("Id").getAsString());
				activity.setName(jsonObject1.get("Name").getAsString());
				activity.setDescription(!jsonObject1.get("Description").isJsonNull()? jsonObject1.get("Description").getAsString():null);
				activity.setParticipation(!jsonObject1.get("Participation").isJsonNull()? jsonObject1.get("Participation").getAsString():null);
				activity.setLocation(!jsonObject1.get("Location").isJsonNull()? jsonObject1.get("Location").getAsString():null);
                activity.setAdd(!jsonObject1.get("Add").isJsonNull()? jsonObject1.get("Add").getAsString():null);
                activity.setRegion(!jsonObject1.get("Region").isJsonNull()? jsonObject1.get("Region").getAsString():null);
                activity.setTown(!jsonObject1.get("Town").isJsonNull()? jsonObject1.get("Town").getAsString():null);
                activity.setTel(!jsonObject1.get("Tel").isJsonNull()? jsonObject1.get("Tel").getAsString():null);
                activity.setOrg(!jsonObject1.get("Org").isJsonNull()? jsonObject1.get("Org").getAsString():null);
                activity.setStart(!jsonObject1.get("Start").isJsonNull()? jsonObject1.get("Start").getAsString():null);
                activity.setEnd(!jsonObject1.get("End").isJsonNull()? jsonObject1.get("End").getAsString():null);
                activity.setCycle(!jsonObject1.get("Cycle").isJsonNull()? jsonObject1.get("Cycle").getAsString():null);
                activity.setNoncycle(!jsonObject1.get("Noncycle").isJsonNull()? jsonObject1.get("Noncycle").getAsString():null);
                activity.setWebsite(!jsonObject1.get("Website").isJsonNull()? jsonObject1.get("Website").getAsString():null);
                activity.setPicture1(!jsonObject1.get("Picture1").isJsonNull()? jsonObject1.get("Picture1").getAsString():null);
                activity.setPicdescribe1(!jsonObject1.get("Picdescribe1").isJsonNull()? jsonObject1.get("Picdescribe1").getAsString():null);
                activity.setPicture2(!jsonObject1.get("Picture2").isJsonNull()? jsonObject1.get("Picture2").getAsString():null);
                activity.setPicdescribe2(!jsonObject1.get("Picdescribe2").isJsonNull()? jsonObject1.get("Picdescribe2").getAsString():null);
                activity.setPicture3(!jsonObject1.get("Picture3").isJsonNull()? jsonObject1.get("Picture3").getAsString():null);
                activity.setPicdescribe3(!jsonObject1.get("Picdescribe3").isJsonNull()? jsonObject1.get("Picdescribe3").getAsString():null);
                activity.setPx(!jsonObject1.get("Px").isJsonNull()? jsonObject1.get("Px").getAsFloat():null);
                activity.setPy(!jsonObject1.get("Py").isJsonNull()? jsonObject1.get("Py").getAsFloat():null);
                activity.setClass1(!jsonObject1.get("Class1").isJsonNull()? jsonObject1.get("Class1").getAsInt():null);
                activity.setClass2(!jsonObject1.get("Class2").isJsonNull()? jsonObject1.get("Class2").getAsString():null);
				activity.setMap(!jsonObject1.get("Map").isJsonNull()? jsonObject1.get("Map").getAsString():null);
				activity.setTravellinginfo(!jsonObject1.get("Travellinginfo").isJsonNull()? jsonObject1.get("Travellinginfo").getAsString():null);
				activity.setParkinginfo(!jsonObject1.get("Parkinginfo").isJsonNull()? jsonObject1.get("Parkinginfo").getAsString():null);
				activity.setCharge(!jsonObject1.get("Charge").isJsonNull()? jsonObject1.get("Charge").getAsString():null);
				activity.setRemarks(!jsonObject1.get("Remarks").isJsonNull()? jsonObject1.get("Remarks").getAsString():null);
				activity.setUpdatetime(UpdatetimeFormat);
				session.save(activity);
				session.flush();
				session.clear();
			}
			session.getTransaction().commit();
			session.close();
			HibernateUtil.closeSessionFactory();
			System.out.println("活動資料新增完畢");

		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
