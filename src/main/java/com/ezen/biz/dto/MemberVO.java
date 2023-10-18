package com.ezen.biz.dto;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class MemberVO {
	private String userid,userpw,username;
	private Date regdate,updatedate;
	private String enabled;
	
	private List<AuthVO> authList;
}
