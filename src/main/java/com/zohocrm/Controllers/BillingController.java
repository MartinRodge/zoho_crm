package com.zohocrm.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.Entities.Billing;
import com.zohocrm.Services.BillingService;

@Controller
public class BillingController {

	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generate")
	public String generateBill(@ModelAttribute("bill") Billing bill,ModelMap model) {
	billingService.generateOneBill(bill);
	List<Billing> bills = billingService.getBill();
	model.addAttribute("bills",bills);
	return"billing_result";

}
}