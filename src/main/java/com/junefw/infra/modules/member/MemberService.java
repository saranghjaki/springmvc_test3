package com.junefw.infra.modules.member;

import java.util.List;

import com.junefw.infra.modules.member.Member;
import com.junefw.infra.modules.member.MemberVo;
import com.junefw.infra.modules.member.Member;
import com.junefw.infra.modules.member.MemberVo;

public interface MemberService {

	public List<Member> selectList(MemberVo vo) throws Exception; 
	public int insert(Member dto) throws Exception;
	public Member selectOne(MemberVo vo) throws Exception;
	public int update(Member dto) throws Exception;
	
}