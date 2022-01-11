package tw.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Spot")
public class SpotBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "Id", nullable = false)
	private String Id;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Toldescribe")
	private String Toldescribe;
	@Column(name = "Description")
	private String Description;
	@Column(name = "Tel")
	private String Tel;
	@Column(name = "`Add`")
	private String Add;
	@Column(name = "Zipcode")
	private String Zipcode;
	@Column(name = "Region")
	private String Region;
	@Column(name = "Town")
	private String Town;
	@Column(name = "Travellinginfo")
	private String Travellinginfo;
	@Column(name = "Opentime")
	private String Opentime;
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
	@Column(name = "`Map`")
	private String Map;
	@Column(name = "Gov")
	private String Gov;
	@Column(name = "Px")
	private float Px;
	@Column(name = "Py")
	private float Py;
	@Column(name = "Orgclass")
	private String Orgclass;
	@Column(name = "Class1")
	private Integer Class1;
	@Column(name = "`Level`")
	private String Level;
	@Column(name = "Website")
	private String Website;
	@Column(name = "Parkinginfo")
	private String Parkinginfo;
	@Column(name = "Parkinginfo_Px")
	private String Parkinginfo_Px;
	@Column(name = "Parkinginfo_Py")
	private String Parkinginfo_Py;
	@Column(name = "Ticketinfo")
	private String Ticketinfo;
	@Column(name = "Remarks")
	private String Remarks;
	@Column(name = "Keyword")
	private String Keyword;
	@Column(name = "Updatetime")
	private String Updatetime;
	@Column(name = "Star")
	private Integer Star;
	@Column(name = "Enable")
	private Integer Enable;

	public SpotBean() {
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

	public String getToldescribe() {
		return Toldescribe;
	}

	public void setToldescribe(String toldescribe) {
		Toldescribe = toldescribe;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getAdd() {
		return Add;
	}

	public void setAdd(String add) {
		Add = add;
	}

	public String getZipcode() {
		return Zipcode;
	}

	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
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

	public String getTravellinginfo() {
		return Travellinginfo;
	}

	public void setTravellinginfo(String travellinginfo) {
		Travellinginfo = travellinginfo;
	}

	public String getOpentime() {
		return Opentime;
	}

	public void setOpentime(String opentime) {
		Opentime = opentime;
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

	public String getMap() {
		return Map;
	}

	public void setMap(String map) {
		Map = map;
	}

	public String getGov() {
		return Gov;
	}

	public void setGov(String gov) {
		Gov = gov;
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

	public String getOrgclass() {
		return Orgclass;
	}

	public void setOrgclass(String orgclass) {
		Orgclass = orgclass;
	}

	public Integer getClass1() {
		return Class1;
	}

	public void setClass1(Integer class1) {
		Class1 = class1;
	}

	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}

	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}

	public String getParkinginfo() {
		return Parkinginfo;
	}

	public void setParkinginfo(String parkinginfo) {
		Parkinginfo = parkinginfo;
	}

	public String getParkinginfo_Px() {
		return Parkinginfo_Px;
	}

	public void setParkinginfo_Px(String parkinginfo_Px) {
		Parkinginfo_Px = parkinginfo_Px;
	}

	public String getParkinginfo_Py() {
		return Parkinginfo_Py;
	}

	public void setParkinginfo_Py(String parkinginfo_Py) {
		Parkinginfo_Py = parkinginfo_Py;
	}

	public String getTicketinfo() {
		return Ticketinfo;
	}

	public void setTicketinfo(String ticketinfo) {
		Ticketinfo = ticketinfo;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	public String getKeyword() {
		return Keyword;
	}

	public void setKeyword(String keyword) {
		Keyword = keyword;
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


