package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public List<Customer> getCustomers() {

		Session session = sessionFactory.getCurrentSession();
		List<Customer> customers = session.createQuery("from Customer", Customer.class).getResultList();
		
		
		return customers;
	}

	public void saveCustomer(Customer customer) {

		Session session = sessionFactory.getCurrentSession();
		session.save(customer);
	}

	public void updateCustomer(Customer customer) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
		
	}

	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Customer where id = :id").setParameter("id", id);
		query.executeUpdate();
	}

	public Customer getCustomerById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.createQuery("from Customer where id = :id", Customer.class).setParameter("id", id).getSingleResult();
		return customer;
	}

}
