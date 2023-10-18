package com.ezen.biz.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import com.ezen.biz.dto.AuthVO;

import lombok.extern.log4j.Log4j;
@Service("customSuccessHandler")
@Log4j
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		//권한 정보를 가져와서 로그인 성공 후 원하는 페이지로 이동한다.
		log.info("login sucess");
		List<String> authNames=new ArrayList<String>();
//		Collection<? extends GrantedAuthority> colr=authentication.getAuthorities();
//		log.info(colr);
//		for(GrantedAuthority auth:colr) {
//			authNames.add(auth.getAuthority());
//		}
		authentication.getAuthorities().forEach(authority->{
			authNames.add(authority.getAuthority());
		});
		log.info("authNames : "+authNames);
		if(authNames.contains("ROLE_USER")) {
			log.info("ROLE_MEMBER");
			response.sendRedirect("/member/member");
			return;
		}else if(authNames.contains("ROLE_ADMIN")) {
			log.info("ROLE_ADMIN");
			response.sendRedirect("/admin/admin");
			return;
		}else response.sendRedirect("/");		
		
	}

}
