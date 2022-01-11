package tw.model;

import java.util.List;

import org.hibernate.Session;

public interface RegionQtyDAOInterface {
	
	@SuppressWarnings("rawtypes")
	public List GetActRegionQty(Session session);
	
	@SuppressWarnings("rawtypes")
	public List GetActRegionName(Session session);

}
