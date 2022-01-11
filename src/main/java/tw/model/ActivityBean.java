package tw.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Activity")
public class ActivityBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "Id", nullable = false)
	private String Id;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Description")
	private String Description;
	@Column(name = "Participation")
	private String Participation;
	@Column(name = "Location")
	private String Location;
	@Column(name = "`Add`")
	private String Add;
	@Column(name = "Region")
	private String Region;
	@Column(name = "Town")
	private String Town;
	@Column(name = "Tel")
	private String Tel;
	@Column(name = "Org")
	private String Org;
	@Column(name = "Start")
	private String Start;
	@Column(name = "End")
	private String End;
	@Column(name = "Cycle")
	private String Cycle;
	@Column(name = "Noncycle")
	private String Noncycle;
	@Column(name = "Website")
	private String Website;
	@Column(name = "Picture1")
	private String Picture1;
	@Column(name = "Picdescribe1")
	private String Picdescribe1;
	@Column(name = "Picture2")
	private String Picture2;
	@Column(name = "Picdescribe2")
	private String Picdescribe2;
	@Column(name = "Picture3")
	private String Picture3;
	@Column(name = "Picdescribe3")
	private String Picdescribe3;
	@Column(name = "Px")
	private float Px;
	@Column(name = "Py")
	private float Py;
	@Column(name = "Class1")
	private Integer Class1;
	@Column(name = "Class2")
	private String Class2;
	@Column(name = "`Map`")
	private String Map;	
	@Column(name = "Travellinginfo")
	private String Travellinginfo;
	@Column(name = "Parkinginfo")
	private String Parkinginfo;
	@Column(name = "Charge")
	private String Charge;
	@Column(name = "Remarks")
	private String Remarks;
	@Column(name = "Updatetime")
	private String Updatetime;
	@Column(name = "Star")
	private Integer Star;
	@Column(name = "Enable")
	private Integer Enable;

	public ActivityBean() {
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getParticipation() {
		return Participation;
	}

	public void setParticipation(String participation) {
		Participation = participation;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getAdd() {
		return Add;
	}

	public void setAdd(String add) {
		Add = add;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getTown() {
		return Town;
	}

	public void setTown(String town) {
		Town = town;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getOrg() {
		return Org;
	}

	public void setOrg(String org) {
		Org = org;
	}

	public String getStart() {
		return Start;
	}

	public void setStart(String start) {
		Start = start;
	}

	public String getEnd() {
		return End;
	}

	public void setEnd(String end) {
		End = end;
	}

	public String getCycle() {
		return Cycle;
	}

	public void setCycle(String cycle) {
		Cycle = cycle;
	}

	public String getNoncycle() {
		return Noncycle;
	}

	public void setNoncycle(String noncycle) {
		Noncycle = noncycle;
	}

	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}

	public String getPicture1() {
		return Picture1;
	}

	public void setPicture1(String picture1) {
		Picture1 = picture1;
	}

	public String getPicdescribe1() {
		return Picdescribe1;
	}

	public void setPicdescribe1(String picdescribe1) {
		Picdescribe1 = picdescribe1;
	}

	public String getPicture2() {
		return Picture2;
	}

	public void setPicture2(String picture2) {
		Picture2 = picture2;
	}

	public String getPicdescribe2() {
		return Picdescribe2;
	}

	public void setPicdescribe2(String picdescribe2) {
		Picdescribe2 = picdescribe2;
	}

	public String getPicture3() {
		return Picture3;
	}

	public void setPicture3(String picture3) {
		Picture3 = picture3;
	}

	public String getPicdescribe3() {
		return Picdescribe3;
	}

	public void setPicdescribe3(String picdescribe3) {
		Picdescribe3 = picdescribe3;
	}

	public float getPx() {
		return Px;
	}

	public void setPx(float px) {
		Px = px;
	}

	public float getPy() {
		return Py;
	}

	public void setPy(float py) {
		Py = py;
	}

	public Integer getClass1() {
		return Class1;
	}

	public void setClass1(Integer class1) {
		Class1 = class1;
	}

	public String getClass2() {
		return Class2;
	}

	public void setClass2(String class2) {
		Class2 = class2;
	}

	public String getMap() {
		return Map;
	}

	public void setMap(String map) {
		Map = map;
	}

	public String getTravellinginfo() {
		return Travellinginfo;
	}

	public void setTravellinginfo(String travellinginfo) {
		Travellinginfo = travellinginfo;
	}

	public String getParkinginfo() {
		return Parkinginfo;
	}

	public void setParkinginfo(String parkinginfo) {
		Parkinginfo = parkinginfo;
	}

	public String getCharge() {
		return Charge;
	}

	public void setCharge(String charge) {
		Charge = charge;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	public String getUpdatetime() {
		return Updatetime;
	}

	public void setUpdatetime(String updatetime) {
		Updatetime = updatetime;
	}

	public Integer getStar() {
		return Star;
	}

	public void setStar(Integer star) {
		Star = star;
	}

	public Integer getEnable() {
		return Enable;
	}

	public void setEnable(Integer enable) {
		Enable = enable;
	}
	
}


