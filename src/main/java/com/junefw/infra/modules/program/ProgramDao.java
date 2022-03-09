package com.junefw.infra.modules.program;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.junefw.infra.modules.code.Code;
import com.junefw.infra.modules.code.CodeVo;

@Repository
public class ProgramDao {

	@Inject
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "com.junefw.infra.modules.program.ProgramMpp";

	public List<Program> selectListProgram(){return sqlSession.selectList(namespace + ".selectListProgram", ""); }
	
	public int insert(Program dto){return sqlSession.insert(namespace + ".insert",dto);}
	 
	public Program selectOne(ProgramVo vo) { return sqlSession.selectOne(namespace + ".selectOne", vo);}
	public int update(Program dto){return sqlSession.update(namespace + ".update", dto);}
	
	
}