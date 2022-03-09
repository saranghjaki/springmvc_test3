package com.junefw.infra.modules.program;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProgramServiceImpl implements ProgramService{
	@Autowired
	ProgramDao dao;

	@Override
	public List<Program> selectListProgram() throws Exception {
		
		return dao.selectListProgram();
	}

	@Override
	public int insert(Program dto) throws Exception {
		return  dao.insert(dto);
	}

	@Override
	public Program selectOne(ProgramVo vo) throws Exception {
		
		return dao.selectOne(vo);
	}

	@Override
	public int update(Program dto) throws Exception {
		// TODO Auto-generated method stub
		return  dao.update(dto);
	}

	
}

