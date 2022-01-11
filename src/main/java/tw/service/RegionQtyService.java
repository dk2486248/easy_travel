package tw.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import tw.model.RegionQtyDAOInterface;
import tw.util.HibernateUtil;

public class RegionQtyService {

	private RegionQtyDAOInterface regionDao;
	
	public RegionQtyService (RegionQtyDAOInterface _regionDao ) {
		this.regionDao = _regionDao;
	}
	
	@SuppressWarnings("rawtypes")
	public List GetActivityRegionQty(){
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try(Session session = factory.getCurrentSession())
		{
			Transaction trans = session.beginTransaction();
			List regionQty = regionDao.GetActRegionQty(session);
			trans.commit();
			return regionQty;
		}
	}

	@SuppressWarnings("rawtypes")
	public List GetActivityRegionName(){
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try(Session session = factory.getCurrentSession())
		{
			Transaction trans = session.beginTransaction();
			List regionName = regionDao.GetActRegionName(session);
			trans.commit();
			return regionName;
		}
	}
}
