package com.ezen.biz.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ezen.biz.dto.MemberVO;
import com.ezen.biz.security.dto.CustomUser;
import com.ezen.biz.service.MemberService;

import lombok.extern.log4j.Log4j;
@Log4j
@Service("customService")
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private MemberService service;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("username :"+username);
		MemberVO vo=service.selectMemberAuth(username);
		return vo==null?null:new CustomUser(vo) ;
	}
}
