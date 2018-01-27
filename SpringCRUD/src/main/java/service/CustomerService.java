package service;

import java.util.List;

import entity.Customer;

public interface CustomerService {

	public void saveCustomer(Customer customer);

	public void deleteCustomer(int id);

	public List<Customer> getCustomers();

	public void updateCustomer(Customer customer);

	public Customer getCustomerById(int id);

}
