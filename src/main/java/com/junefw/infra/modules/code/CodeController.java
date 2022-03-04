package com.junefw.infra.modules.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CodeController {

	@Autowired 
	//new생성자기능 선언 서비스를 호출
	CodeServiceImpl service;
	
	@RequestMapping(value = "/code/codeGroupList")

	public String codeGroupList(Model model) throws Exception {
		//호출한 서비스 결과를 리스트에 담는다
		List<Code> list = service.selectList();
		//리스트타입을 리스트에 담는다
		model.addAttribute("list", list); 
		
		return "code/codeGroupList";
	}
	
	@RequestMapping(value = "/code/codeGroupForm") 
	public String codeGroupForm(Model model) throws Exception {

		return "code/codeGroupForm";
	}
	
	@RequestMapping(value = "/code/codeGroupInst") 
	public String codeGroupInst(Model model, Code dto) throws Exception {
		
			 
		service.insert(dto);
	
		return "";
	}
	
	@RequestMapping(value = "/code/codeGroupView") 
	public String codeGroupView(CodeVo vo, Model model ) throws Exception {
		
		System.out.println("vo.getPilcgSeq("+vo.getPilcgSeq()+")");
	
		//디비까지 가서 한건의 데이터 값을 가지고온다.
		Code rt = service.selectOne(vo);
		
		//가지고 온값을 jsp로 넘겨준다
		model.addAttribute("rt",rt);
		
		
		return "code/codeGroupView";
	}
	
}


