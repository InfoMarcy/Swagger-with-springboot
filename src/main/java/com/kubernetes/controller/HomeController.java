package com.kubernetes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	
	     // redirect to swagger page
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String home() {

			// redirect to index page
			return "redirect:/swagger-ui.html#/";
		}
		

}
