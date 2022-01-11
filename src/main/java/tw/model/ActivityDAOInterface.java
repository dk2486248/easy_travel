package tw.model;

import java.util.List;

import org.hibernate.Session;

public interface ActivityDAOInterface {
	
	public List<ActivityBean> GetActivityByPageByRegion(Session session, Integer page, String region);
	public List<ActivityBean> GetActivityById(Session session, String id);
	public Long GetOneRegionRecordQty(Session session, String Region);

}
