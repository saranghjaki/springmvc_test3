package com.junefw.infra.modules.codeGroup;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
//  퍼시스턴스 레이어, DB나 파일같은 외부 I/O 작업을 처리함
public class CodeGroupDao {

	@Inject
//	빈객체를 자동으로 주입받을 수 있도록 해주는 어노테이션
//	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "com.junefw.infra.modules.codeGroup.CodeGroupMpp";

	public List<CodeGroup> selectList(){ return sqlSession.selectList(namespace + ".selectList", ""); }
	
	
}