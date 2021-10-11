package com.petsforhire.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.petsforhire.main.model.User;
import com.petsforhire.main.service.UserService;


@RestController
public class RESTController {
	
	@Autowired
	UserService userService;
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//	public String saveProduct(@ModelAttribute("user") User user) {
//		userService.save(user);
//		
//		return "redirect:/";
//	}
	
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//	public String saveProduct(@ModelAttribute("product") Product product) {
//		service.save(product);
//		
//		return "redirect:/";
//	}

	
}
