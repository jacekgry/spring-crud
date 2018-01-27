package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import entity.Customer;
import service.CustomerService;
import service.HousesService;

@Controller
public class AddController {

	@Autowired
	CustomerService CustomerServiceImpl;
	
	@Autowired
	HousesService HousesServiceImpl;
	
	@GetMapping("/addCustomer")
	public String handleAddGet(Model model, @ModelAttribute Customer customer) {
		
		List<String> houses = HousesServiceImpl.getHouses();
		model.addAttribute("houses", houses);
		
		return "addForm";
	}
	
	@PostMapping
	public String handleAddPost(Model model, @ModelAttribute Customer customer) {
		
		CustomerServiceImpl.saveCustomer(customer);
		
		
		return "redirect:listCustomers";
	}
}
