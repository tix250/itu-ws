package com.javainuse.backOffice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javainuse.dao.MikaInterface;
import com.javainuse.repository.MikaRepository;

@Controller
public class BackOfficeControlleur {
	
	@Autowired
	private MikaRepository mr;
	
	@Autowired
	private MikaInterface mi;
	
	@RequestMapping(value = "/index" )
	public String index()
	{
		return "index";
	}
	
	 @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	 public String index(Model model) 
	 {

	        String message = "Hello Spring Boot + JSP";

	        model.addAttribute("message", message);

	        return "index";
	 }
}
