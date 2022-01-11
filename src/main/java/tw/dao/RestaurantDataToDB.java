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
import tw.model.RestaurantBean;

public class RestaurantDataToDB {

	public static void main(String[] args){

		JsonParser parser=new JsonParser();
		try {
			JsonObject object=(JsonObject) parser.parse(new FileReader("C:\\Users\\lyang\\Downloads\\restaurant_C_f.json"));
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
			RestaurantBean res = new RestaurantBean();

			for (int i = 0; i < jsonArray.size(); i++) {
				
				JsonObject jsonObject1 = jsonArray.get(i).getAsJsonObject();
				res.setId(jsonObject1.get("Id").getAsString());
				res.setName(jsonObject1.get("Name").getAsString());
				res.setDescription(!jsonObject1.get("Description").isJsonNull()? jsonObject1.get("Description").getAsString():null);
                res.setAdd(!jsonObject1.get("Add").isJsonNull()? jsonObject1.get("Add").getAsString():null);
                res.setZipcode(!jsonObject1.get("Zipcode").isJsonNull()? jsonObject1.get("Zipcode").getAsString():null);
                res.setRegion(!jsonObject1.get("Region").isJsonNull()? jsonObject1.get("Region").getAsString():null);
                res.setTown(!jsonObject1.get("Town").isJsonNull()? jsonObject1.get("Town").getAsString():null);
                res.setTel(!jsonObject1.get("Tel").isJsonNull()? jsonObject1.get("Tel").getAsString():null);
                res.setOpentime(!jsonObject1.get("Opentime").isJsonNull()? jsonObject1.get("Opentime").getAsString():null);
                res.setWebsite(!jsonObject1.get("Website").isJsonNull()? jsonObject1.get("Website").getAsString():null);
                res.setPicture1(!jsonObject1.get("Picture1").isJsonNull()? jsonObject1.get("Picture1").getAsString():null);
                res.setPicdescribe1(!jsonObject1.get("Picdescribe1").isJsonNull()? jsonObject1.get("Picdescribe1").getAsString():null);
                res.setPicture2(!jsonObject1.get("Picture2").isJsonNull()? jsonObject1.get("Picture2").getAsString():null);
                res.setPicdescribe2(!jsonObject1.get("Picdescribe2").isJsonNull()? jsonObject1.get("Picdescribe2").getAsString():null);
                res.setPicture3(!jsonObject1.get("Picture3").isJsonNull()? jsonObject1.get("Picture3").getAsString():null);
                res.setPicdescribe3(!jsonObject1.get("Picdescribe3").isJsonNull()? jsonObject1.get("Picdescribe3").getAsString():null);
                res.setPx(!jsonObject1.get("Px").isJsonNull()? jsonObject1.get("Px").getAsFloat():null);
                res.setPy(!jsonObject1.get("Py").isJsonNull()? jsonObject1.get("Py").getAsFloat():null);
                res.setClass1(!jsonObject1.get("Class").isJsonNull()? jsonObject1.get("Class").getAsInt():null);
				res.setMap(!jsonObject1.get("Map").isJsonNull()? jsonObject1.get("Map").getAsString():null);
				res.setParkinginfo(!jsonObject1.get("Parkinginfo").isJsonNull()? jsonObject1.get("Parkinginfo").getAsString():null);
				res.setUpdatetime(UpdatetimeFormat);
				session.save(res);
				session.flush();
				session.clear();
			}
			session.getTransaction().commit();
			session.close();
			HibernateUtil.closeSessionFactory();
			System.out.println("餐廳資料新增完畢");

		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
