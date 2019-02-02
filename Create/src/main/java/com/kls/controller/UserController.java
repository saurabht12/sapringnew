package com.kls.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import com.kls.bean.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kls.bean.Login;
import com.kls.bean.User;

@Controller
public class UserController {

	 private UserService userService;      
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String Add(@Validated User user, Model model) {
		System.out.println("User Add");
		model.addAttribute("userAttr", new User());
		return "welcome";
	}
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	 public String editUser(@RequestParam(value="id", required=true) User user, Model model) {
	        
	        model.addAttribute("userAttr", userService.update(user));     
	        return "welcome";
	    }
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String findAll(@Validated User user, Model model) {
		System.out.println("User Find Records");
		 List list = userService.getAll();    
		 System.out.println("Data"+list);
	        model.addAttribute("users", list);     
	        return "welcome";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String UserLogin(@Validated Login login, Model model) {
		System.out.println("User Login1");
		model.addAttribute("userName", login.getName());
		return "welcome";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String Delete(@RequestParam(value="id", required=true) String id, Model model) {
		System.out.println("User Page Requested");
		userService.delete(id);
		return "welcome";
	}
	
}
