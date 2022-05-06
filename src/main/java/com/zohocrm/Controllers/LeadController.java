package com.zohocrm.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.Entities.Contact;
import com.zohocrm.Entities.Lead;
import com.zohocrm.Services.ContactService;
import com.zohocrm.Services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	
	@RequestMapping("/view")
	public String viewCreateLead() {
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String SaveOneLead(@ModelAttribute ("lead")Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return"lead_info";
	}

	@RequestMapping("/listallleads")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.findAllLeads();
		model.addAttribute("leads", leads);
		return "lead_result";
	}

	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id, ModelMap model) {
		Lead lead =leadService.getLead(id);
		model.addAttribute("lead",lead);
		return"lead_info";
	}

	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, ModelMap Model) {
		Lead lead = leadService.getLead(id);
		
		Contact contact=new Contact();
		contact.setFirstName(lead.getfirstName());
		contact.setLastName(lead.getlastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		contactService.saveContact(contact);
		
		leadService.deleteLead(id);
		
		List<Contact> contacts = contactService.findAllContacts();
		Model.addAttribute("contacts", contacts);
		return "contact_result";
	}
	
}
