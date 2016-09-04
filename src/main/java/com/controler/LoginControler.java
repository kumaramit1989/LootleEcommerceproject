package com.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControler
{
	
		@RequestMapping("/AboutUs")
		public String showAboutUs() 
		{
		return "AboutUs";
		}
		@RequestMapping("/ContactUs")
		public String showContactUs() 
		{
		return "ContactUs";
		}
		@RequestMapping("/Login")
		public String showLogin() 
		{
		return "Login";
		}
		@RequestMapping("/Registration")
		public String showRegistraion() 
		{
		return "Registration";
		}
}



