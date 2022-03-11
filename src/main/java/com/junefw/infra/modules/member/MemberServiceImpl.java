package com.junefw.infra.modules.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberDao dao;
	
	@Override
	public List<Member> selectList(MemberVo vo) throws Exception {
		return dao.selectList(vo); 
	}

	@Override
	public int insert(Member dto) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(dto);
	}

	@Override
	public Member selectOne(MemberVo vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectOne(vo);
	}

	@Override
	public int update(Member dto) throws Exception {
		// TODO Auto-generated method stub
		return dao.update(dto);	
	}

	
	
}

