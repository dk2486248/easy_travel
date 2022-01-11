package tw.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import tw.model.ActivityBean;
import tw.model.ActivityDAOInterface;

public class ActivityDAO implements ActivityDAOInterface {

	public ActivityDAO () {
		
	}

	@Override
	public List<ActivityBean> GetActivityByPageByRegion(Session session, Integer page, String region) {
		Query<ActivityBean> query = session.createQuery("from ActivityBean where Region = :region", ActivityBean.class);
		query.setParameter("region", region);
	    query.setMaxResults(20);
	    query.setFirstResult((page-1)*20);	    
		return query.list();
	}

	@Override
	public List<ActivityBean>  GetActivityById(Session session, String id) {
		Query<ActivityBean> query = session.createQuery("from ActivityBean where Id = :id", ActivityBean.class);
		query.setParameter("id", id);   
		return query.list();
	}

	
	@Override
	public Long GetOneRegionRecordQty(Session session, String region) {
		@SuppressWarnings("rawtypes")
		Query query = session.createQuery("select count(*) from ActivityBean where Region = :region");
		query.setParameter("region", region);
		Long count = (Long)query.uniqueResult();
		return count;
	}
}




