package com.ezen.biz.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.biz.dto.AuthVO;
import com.ezen.biz.dto.MemberVO;

@Repository
public class MemberDAO{
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertMember(MemberVO vo) {
		mybatis.insert("MemberDAO.insertMember", vo);
	}
	public List<MemberVO> selectMember(){
		return mybatis.selectList("MemberDAO.selectMember");
	}
	public void insertMemberAuth(AuthVO vo) {
		mybatis.insert("MemberDAO.insertMemberAuth", vo);
	}
	public List<AuthVO> selectAuth(){
		return mybatis.selectList("MemberDAO.selectAuth");
	}
	
	public MemberVO selectMemberAuth(String userid) {
		return mybatis.selectOne("MemberDAO.selectMemberAuth",userid);
	}
}
