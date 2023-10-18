package com.ezen.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.MemberDAO;
import com.ezen.biz.dto.AuthVO;
import com.ezen.biz.dto.MemberVO;
@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDAO dao;
	@Override
	public void insertMember(MemberVO vo) {
		dao.insertMember(vo);		
	}

	@Override
	public List<MemberVO> selectMember() {
		return dao.selectMember();
	}

	@Override
	public void insertMemberAuth(AuthVO vo) {
		dao.insertMemberAuth(vo);
		
	}

	@Override
	public List<AuthVO> selectAuth() {
		
		return dao.selectAuth();
	}

	@Override
	public MemberVO selectMemberAuth(String userid) {
		return dao.selectMemberAuth(userid);
	}

}
