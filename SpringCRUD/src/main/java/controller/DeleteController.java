package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.CustomerService;
import service.HousesService;

@Controller
public class DeleteController {

	@Autowired
	CustomerService CustomerServiceImpl;
	
	@Autowired
	HousesService HousesServiceImpl;
	
	@GetMapping("/deleteCustomer")
	public String handleDeleteGet(Model model, @RequestParam int id) {
		
		CustomerServiceImpl.deleteCustomer(id);
		return "redirect:listCustomers";
	}
	

}
