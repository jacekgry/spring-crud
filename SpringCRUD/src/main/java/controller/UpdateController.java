package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.Customer;
import service.CustomerService;
import service.HousesService;

@Controller
public class UpdateController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	HousesService HousesServiceImpl;
	
	@GetMapping("/updateCustomer")
	public String handleUpdateGet(@RequestParam int id, Model model) {
		
		List<String> houses = HousesServiceImpl.getHouses();
		model.addAttribute("houses", houses);
		Customer customer = customerService.getCustomerById(id);
		model.addAttribute(customer);
		return "updateForm";
	}
	
	@PostMapping("/updateCustomer")
	public String handleUpdateGet(@ModelAttribute Customer customer, Model model) {
		
		customerService.updateCustomer(customer);
		return "redirect:listCustomers";
	}
	
	
}
