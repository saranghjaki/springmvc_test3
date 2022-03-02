package com.junefw.infra.modules.codeGroup;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CodeGroupDao {

	@Inject
//	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "com.junefw.infra.modules.codeGroup.CodeGroupMpp";

	public List<CodeGroup> selectList(){ return sqlSession.selectList(namespace + ".selectList", ""); }
	
	
}