package tw.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RegionQty")
public class RegionQtyBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "Id", nullable = false)
	private String Id;
	@Column(name = "Region")
	private String Region;
	@Column(name = "ActQty")
	private String ActQty;
	@Column(name = "HotelQty")
	private String HotelQty;
	@Column(name = "SpotQty")
	private String SpotQty;
	@Column(name = "ResQty")
	private String ResQty;

	public RegionQtyBean() {
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getActQty() {
		return ActQty;
	}

	public void setActQty(String actQty) {
		ActQty = actQty;
	}

	public String getHotelQty() {
		return HotelQty;
	}

	public void setHotelQty(String hotelQty) {
		HotelQty = hotelQty;
	}

	public String getSpotQty() {
		return SpotQty;
	}

	public void setSpotQty(String spotQty) {
		SpotQty = spotQty;
	}

	public String getResQty() {
		return ResQty;
	}

	public void setResQty(String resQty) {
		ResQty = resQty;
	}
	
}


