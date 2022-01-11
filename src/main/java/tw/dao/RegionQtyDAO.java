package tw.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import tw.model.RegionQtyDAOInterface;

public class RegionQtyDAO implements RegionQtyDAOInterface {

	@SuppressWarnings("rawtypes")
	@Override
	public List GetActRegionQty(Session session) {
		Query query = session.createQuery("select ActQty from RegionQtyBean");
		List count = query.getResultList();
		return count;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List GetActRegionName(Session session) {
		Query query = session.createQuery("select Region from RegionQtyBean");
		List regionName = query.getResultList();
		return regionName;
	}

}
