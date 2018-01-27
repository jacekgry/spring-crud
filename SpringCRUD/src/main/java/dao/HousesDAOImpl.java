package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HousesDAOImpl implements HousesDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public List<String> getHouses() {
		Session session = sessionFactory.getCurrentSession();
		List<String> houses = session.createQuery("select name from House", String.class).getResultList();
		return houses;
	}

}
