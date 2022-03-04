package com.junefw.infra.modules.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberDao dao;
	
	@Override
	public List<Member> selectList() throws Exception {
		return dao.selectList(); 
	}
	public int insert(Member dto) throws Exception{
		return dao.insert(dto);
	}
	@Override
	public Member selectOne(MemberVo vo) throws Exception {
		
		return  dao.selectOne(vo);
	}
	
}

