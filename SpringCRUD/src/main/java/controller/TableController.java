package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.CustomerDAO;
import entity.Customer;
import service.CustomerService;

@Controller
public class TableController {

	
	@Autowired
	private CustomerDAO CustomerDAOImpl;
	
	@Autowired
	private CustomerService CustomerServiceImpl;
	
	@RequestMapping("/listCustomers")
	public String listCustomers(Model model) {
		List<Customer> customers = CustomerServiceImpl.getCustomers();
		model.addAttribute("customers", customers);
		System.out.println(customers);
		

		return "list";
	}
}
