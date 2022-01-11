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
import tw.model.SpotBean;

public class SpotDataToDB {

	public static void main(String[] args){

		JsonParser parser=new JsonParser();
		try {
			JsonObject object=(JsonObject) parser.parse(new FileReader("C:\\Users\\lyang\\Downloads\\scenic_spot_C_f.json"));
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
			SpotBean spot = new SpotBean();

			for (int i = 0; i < jsonArray.size(); i++) {
				
				JsonObject jsonObject1 = jsonArray.get(i).getAsJsonObject();
				spot.setId(jsonObject1.get("Id").getAsString());
				spot.setName(jsonObject1.get("Name").getAsString());
				spot.setToldescribe(!jsonObject1.get("Toldescribe").isJsonNull()? jsonObject1.get("Toldescribe").getAsString():null);
				spot.setDescription(!jsonObject1.get("Description").isJsonNull()? jsonObject1.get("Description").getAsString():null);
				spot.setTel(!jsonObject1.get("Tel").isJsonNull()? jsonObject1.get("Tel").getAsString():null);
                spot.setAdd(!jsonObject1.get("Add").isJsonNull()? jsonObject1.get("Add").getAsString():null);
                spot.setZipcode(!jsonObject1.get("Zipcode").isJsonNull()? jsonObject1.get("Zipcode").getAsString():null);
                spot.setRegion(!jsonObject1.get("Region").isJsonNull()? jsonObject1.get("Region").getAsString():null);
                spot.setTown(!jsonObject1.get("Town").isJsonNull()? jsonObject1.get("Town").getAsString():null);
                spot.setTravellinginfo(!jsonObject1.get("Travellinginfo").isJsonNull()? jsonObject1.get("Travellinginfo").getAsString():null);
                spot.setOpentime(!jsonObject1.get("Opentime").isJsonNull()? jsonObject1.get("Opentime").getAsString():null);
                spot.setPicture1(!jsonObject1.get("Picture1").isJsonNull()? jsonObject1.get("Picture1").getAsString():null);
                spot.setPicdescribe1(!jsonObject1.get("Picdescribe1").isJsonNull()? jsonObject1.get("Picdescribe1").getAsString():null);
                spot.setPicture2(!jsonObject1.get("Picture2").isJsonNull()? jsonObject1.get("Picture2").getAsString():null);
                spot.setPicdescribe2(!jsonObject1.get("Picdescribe2").isJsonNull()? jsonObject1.get("Picdescribe2").getAsString():null);
                spot.setPicture3(!jsonObject1.get("Picture3").isJsonNull()? jsonObject1.get("Picture3").getAsString():null);
                spot.setPicdescribe3(!jsonObject1.get("Picdescribe3").isJsonNull()? jsonObject1.get("Picdescribe3").getAsString():null);
                spot.setMap(!jsonObject1.get("Map").isJsonNull()? jsonObject1.get("Map").getAsString():null);
                spot.setGov(!jsonObject1.get("Gov").isJsonNull()? jsonObject1.get("Gov").getAsString():null);
                spot.setPx(!jsonObject1.get("Px").isJsonNull()? jsonObject1.get("Px").getAsFloat():null);
                spot.setPy(!jsonObject1.get("Py").isJsonNull()? jsonObject1.get("Py").getAsFloat():null);
                spot.setOrgclass(!jsonObject1.get("Orgclass").isJsonNull()? jsonObject1.get("Orgclass").getAsString():null);
                spot.setClass1(!jsonObject1.get("Class1").isJsonNull()? jsonObject1.get("Class1").getAsInt():null);
                spot.setLevel(!jsonObject1.get("Level").isJsonNull()? jsonObject1.get("Level").getAsString():null);
                spot.setWebsite(!jsonObject1.get("Website").isJsonNull()? jsonObject1.get("Website").getAsString():null);
                spot.setParkinginfo(!jsonObject1.get("Parkinginfo").isJsonNull()? jsonObject1.get("Parkinginfo").getAsString():null);
                spot.setParkinginfo_Px(!jsonObject1.get("Parkinginfo_Px").isJsonNull()? jsonObject1.get("Parkinginfo_Px").getAsString():null);
                spot.setParkinginfo_Py(!jsonObject1.get("Parkinginfo_Py").isJsonNull()? jsonObject1.get("Parkinginfo_Py").getAsString():null);
                spot.setTicketinfo(!jsonObject1.get("Ticketinfo").isJsonNull()? jsonObject1.get("Ticketinfo").getAsString():null);
                spot.setRemarks(!jsonObject1.get("Remarks").isJsonNull()? jsonObject1.get("Remarks").getAsString():null);
                spot.setKeyword(!jsonObject1.get("Keyword").isJsonNull()? jsonObject1.get("Keyword").getAsString():null);
				spot.setUpdatetime(UpdatetimeFormat);
				session.save(spot);
				session.flush();
				session.clear();
			}
			session.getTransaction().commit();
			session.close();
			HibernateUtil.closeSessionFactory();
			System.out.println("景點資料新增完畢");

		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
