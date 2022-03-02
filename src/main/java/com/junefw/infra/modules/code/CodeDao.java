package com.junefw.infra.modules.code;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CodeDao {

	@Inject
	@Resource(name = "sqlSession")
	private SqlSession sqlSession; //라이버러리 
	
	private static String namespace = "com.junefw.infra.modules.code.CodeMpp";

	public List<Code> selectList(){ return sqlSession.selectList(namespace + ".selectList", ""); }
	//코드부르는 함수
}