package com.ezen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/admin/*")
@Controller
public class AdminController {
	@GetMapping("/all")
	  public void doAll() {	    
	    log.info("do all can access everybody");
	  }
	  	  
	  @GetMapping("/admin")
	  public void doAdmin() {
	    
	    log.info("admin only");
	  }
	  @GetMapping("/cateManage")
	  public String cateManage() {	    
	    log.info("카테고리 관리");
	    return "admin/cateManage";
	  }
	  @GetMapping("/productManage")
	  public String productManage() {	    
	    log.info("카테고리 관리");
	    return "admin/productManage";
	  }
}
