package com.ezen.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;
import oracle.jdbc.proxy.annotation.Post;
@Log4j
@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	  @GetMapping("/")
	  public void doMember(HttpServletResponse response) throws IOException {	    
	    log.info("logined member");
	    response.sendRedirect("/member/member");
	  }
	  @GetMapping("/member")
	  public void doMember() {	    
	    log.info("logined member");

	  }
	  @GetMapping("/mypage")
	  public void mypage() {
	    
	    log.info("mypage");
	  }
	  @GetMapping("/buyList")
	  public void buyList() {
	    
	    log.info("buyList");
	  }
}
