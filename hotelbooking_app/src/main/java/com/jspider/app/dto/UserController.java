package com.jspider.app.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/userData")
	ModelAndView getUserData(UserDto userData) {
		System.out.println(userData);
		return new ModelAndView("index.jsp");
	}
	

}
