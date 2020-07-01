package com.personnel.loginapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView checkUser(@RequestParam("inputUsername") String Username,@RequestParam("inputPassword") String Password, HttpServletRequest req,HttpServletResponse res)
	{
		ModelAndView mv = new ModelAndView();
		//String Username = req.getParameter("inputUsername");
		//String Password = req.getParameter("inputPassword");
		
		if(Username.equalsIgnoreCase("TEST@gmail.com")) {
			mv.setViewName("success");
		}
		else
		{
			mv.setViewName("index");
		}
		
		
		return mv;
	}
}
