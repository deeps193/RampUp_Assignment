package com.hcl.controller;
 
import java.util.List;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.ContactBusiness;
import com.hcl.model.Contact;
 
@Controller
public class AppController {
     
    @RequestMapping("/list_contact")
    public String listContact(Model model) {
         
        ContactBusiness business = new ContactBusiness();
        List<Contact> contactList = business.getContactList();
         
        model.addAttribute("contacts", contactList);       
         
        return "contact";
    }
    @RequestMapping("/")
	public String welcome() {
	    return "index";
	}
	@RequestMapping("/contact")
	public String test() {
	     return "contact.jsp";
	}
}