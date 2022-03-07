package com.junefw.infra.modules.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CodeServiceImpl implements CodeService{

	@Autowired
	CodeDao dao;
	
	@Override
	public List<Code> selectList() throws Exception {
		return dao.selectList(); 
	}

	@Override
	public int insert(Code dto) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(dto);
		
	}

	@Override
		public Code selectOne(CodeVo vo) throws Exception{
		
		return dao.selectOne(vo);
		
		}

	@Override
	public int update(Code dto) throws Exception {
		
		return dao.update(dto);	
		}
	
		/* CODE S */

	@Override
	public List<Code> selectList1() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectList1();
	}

	@Override
	public int insert1(Code dto) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert1(dto);
	}

	@Override
	public Code selectOne1(CodeVo vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectOne1(vo);
	}

	@Override
	public int update1(Code dto) throws Exception {
		// TODO Auto-generated method stub
		return dao.update1(dto);	
	}
		
	
	
}

