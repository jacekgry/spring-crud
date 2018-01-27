package dao;

import java.util.List;

//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;

import entity.Customer;


public interface CustomerDAO {

	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(int id);
	public Customer getCustomerById(int id);
}
