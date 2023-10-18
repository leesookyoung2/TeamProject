package com.ezen.biz.service;

import java.util.List;

import com.ezen.biz.dto.AuthVO;
import com.ezen.biz.dto.MemberVO;

public interface MemberService {

	void insertMember(MemberVO vo);

	List<MemberVO> selectMember();

	void insertMemberAuth(AuthVO vo);

	List<AuthVO> selectAuth();

	MemberVO selectMemberAuth(String userid);

}