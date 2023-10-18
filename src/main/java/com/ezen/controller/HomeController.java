package com.ezen.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	@RequestMapping("/customLogin")
	public void login(String error,String logout,Model model) {
		log.info(error);
		log.info(logout);
		if(error!=null) {
			model.addAttribute("error", "Login Error! 계정을 확인 하세요.");
		}
		if(logout!=null) {
			model.addAttribute("logout", "Logout!!");
		}		
	}
	@RequestMapping("/accessError")
	public void accessError(Authentication auth,Model model) {
		log.info("Access Denied : "+auth);
		model.addAttribute("msg","Access Denied");
	}
	@GetMapping("/customLogout")
	public void logout() {
		log.info("logout");
	}
}
