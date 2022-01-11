package tw.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import tw.model.ActivityBean;
import tw.model.ActivityDAOInterface;
import tw.util.HibernateUtil;

public class ActivityPageService {

	private ActivityDAOInterface activityDao;
	
	public ActivityPageService (ActivityDAOInterface _activityDao ) {
		this.activityDao = _activityDao;
	}
	
	public List<ActivityBean> GetActivityByPage(Integer page, String region){
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try(Session session = factory.getCurrentSession())
		{
			Transaction trans = session.beginTransaction();
			List<ActivityBean> activies = activityDao.GetActivityByPageByRegion(session, page, region);
			trans.commit();
			return activies;
		}
	}
	
	public List<ActivityBean> GetActivityById(String id){
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try(Session session = factory.getCurrentSession())
		{
			Transaction trans = session.beginTransaction();
			List<ActivityBean> activies = activityDao.GetActivityById(session, id);
			trans.commit();
			return activies;
		}
	}

	public Long GetOneRegionRecordQty(String Region){
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try(Session session = factory.getCurrentSession())
		{
			Transaction trans = session.beginTransaction();
			Long count = activityDao.GetOneRegionRecordQty(session, Region);
			trans.commit();
			return count;
		}
	}
	
}
