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
import tw.model.HotelBean;

public class HotelDataToDB {

	public static void main(String[] args){

		JsonParser parser=new JsonParser();
		try {
			JsonObject object=(JsonObject) parser.parse(new FileReader("C:\\Users\\lyang\\Downloads\\hotel_C_f.json"));
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
			HotelBean hotel = new HotelBean();

			for (int i = 0; i < jsonArray.size(); i++) {
				
				JsonObject jsonObject1 = jsonArray.get(i).getAsJsonObject();
				hotel.setId(jsonObject1.get("Id").getAsString());
				hotel.setName(jsonObject1.get("Name").getAsString());
				hotel.setDescription(!jsonObject1.get("Description").isJsonNull()? jsonObject1.get("Description").getAsString():null);
				hotel.setGrade(!jsonObject1.get("Grade").isJsonNull()? jsonObject1.get("Grade").getAsString():null);
                hotel.setAdd(!jsonObject1.get("Add").isJsonNull()? jsonObject1.get("Add").getAsString():null);
                hotel.setZipcode(!jsonObject1.get("Zipcode").isJsonNull()? jsonObject1.get("Zipcode").getAsString():null);
                hotel.setRegion(!jsonObject1.get("Region").isJsonNull()? jsonObject1.get("Region").getAsString():null);
                hotel.setTown(!jsonObject1.get("Town").isJsonNull()? jsonObject1.get("Town").getAsString():null);
                hotel.setTel(!jsonObject1.get("Tel").isJsonNull()? jsonObject1.get("Tel").getAsString():null);
                hotel.setFax(!jsonObject1.get("Fax").isJsonNull()? jsonObject1.get("Fax").getAsString():null);
                hotel.setWebsite(!jsonObject1.get("Website").isJsonNull()? jsonObject1.get("Website").getAsString():null);
                hotel.setPicture1(!jsonObject1.get("Picture1").isJsonNull()? jsonObject1.get("Picture1").getAsString():null);
                hotel.setPicdescribe1(!jsonObject1.get("Picdescribe1").isJsonNull()? jsonObject1.get("Picdescribe1").getAsString():null);
                hotel.setPicture2(!jsonObject1.get("Picture2").isJsonNull()? jsonObject1.get("Picture2").getAsString():null);
                hotel.setPicdescribe2(!jsonObject1.get("Picdescribe2").isJsonNull()? jsonObject1.get("Picdescribe2").getAsString():null);
                hotel.setPicture3(!jsonObject1.get("Picture3").isJsonNull()? jsonObject1.get("Picture3").getAsString():null);
                hotel.setPicdescribe3(!jsonObject1.get("Picdescribe3").isJsonNull()? jsonObject1.get("Picdescribe3").getAsString():null);
                hotel.setPx(!jsonObject1.get("Px").isJsonNull()? jsonObject1.get("Px").getAsFloat():null);
                hotel.setPy(!jsonObject1.get("Py").isJsonNull()? jsonObject1.get("Py").getAsFloat():null);
				hotel.setMap(!jsonObject1.get("Map").isJsonNull()? jsonObject1.get("Map").getAsString():null);
				hotel.setSpec(!jsonObject1.get("Spec").isJsonNull()? jsonObject1.get("Spec").getAsString():null);
				hotel.setServiceinfo(!jsonObject1.get("Serviceinfo").isJsonNull()? jsonObject1.get("Serviceinfo").getAsString():null);
				hotel.setParkinginfo(!jsonObject1.get("Parkinginfo").isJsonNull()? jsonObject1.get("Parkinginfo").getAsString():null);
				hotel.setTotalNumberofRooms(!jsonObject1.get("TotalNumberofRooms").isJsonNull()? jsonObject1.get("TotalNumberofRooms").getAsString():null);
				hotel.setLowestPrice(!jsonObject1.get("LowestPrice").isJsonNull()? jsonObject1.get("LowestPrice").getAsString():null);
				hotel.setCeilingPrice(!jsonObject1.get("CeilingPrice").isJsonNull()? jsonObject1.get("CeilingPrice").getAsString():null);
				hotel.setTaiwanHost(!jsonObject1.get("TaiwanHost").isJsonNull()? jsonObject1.get("TaiwanHost").getAsString():null);
				hotel.setIndustryEmail(!jsonObject1.get("IndustryEmail").isJsonNull()? jsonObject1.get("IndustryEmail").getAsString():null);
				hotel.setTotalNumberofPeople(!jsonObject1.get("TotalNumberofPeople").isJsonNull()? jsonObject1.get("TotalNumberofPeople").getAsString():null);
				hotel.setAccessibilityRooms(!jsonObject1.get("AccessibilityRooms").isJsonNull()? jsonObject1.get("AccessibilityRooms").getAsString():null);
				hotel.setPublicToilets(!jsonObject1.get("PublicToilets").isJsonNull()? jsonObject1.get("PublicToilets").getAsString():null);
				hotel.setLiftingEquipment(!jsonObject1.get("LiftingEquipment").isJsonNull()? jsonObject1.get("LiftingEquipment").getAsString():null);
				hotel.setParkingSpace(!jsonObject1.get("ParkingSpace").isJsonNull()? jsonObject1.get("ParkingSpace").getAsString():null);
				hotel.setUpdatetime(UpdatetimeFormat);
				session.save(hotel);

				session.flush();
				session.clear();
			}
			session.getTransaction().commit();
			session.close();
			HibernateUtil.closeSessionFactory();
			System.out.println("住宿資料新增完畢");

		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
