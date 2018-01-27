package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.CustomerDAO;
import entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO CustomerDAOImpl;

	@Transactional
	public void saveCustomer(Customer customer) {
		CustomerDAOImpl.saveCustomer(customer);
	}

	@Transactional
	public void deleteCustomer(int id) {
		CustomerDAOImpl.deleteCustomer(id);
	}

	@Transactional
	public List<Customer> getCustomers() {
		return CustomerDAOImpl.getCustomers();
	}
	
	@Transactional
	public void updateCustomer(Customer customer) {
		CustomerDAOImpl.updateCustomer(customer);
	}
	@Transactional
	public Customer getCustomerById(int id) {
		return CustomerDAOImpl.getCustomerById(id);
	}

}
