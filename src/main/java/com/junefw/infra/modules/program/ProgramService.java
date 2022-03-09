package com.junefw.infra.modules.program;

import java.util.List;

import com.junefw.infra.modules.program.Program;
import com.junefw.infra.modules.program.ProgramVo;

public interface ProgramService {

	public List<Program> selectListProgram() throws Exception; 
	public int insert(Program dto) throws Exception;
	public Program selectOne(ProgramVo vo) throws Exception;
	public int update(Program dto) throws Exception;
	
}