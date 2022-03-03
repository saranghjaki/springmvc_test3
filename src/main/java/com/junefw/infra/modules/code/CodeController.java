package com.junefw.infra.modules.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CodeController {

	@Autowired
	CodeServiceImpl service;
	
	@RequestMapping(value = "/code/codeGroupList")

	public String codeGroupList(Model model) throws Exception {
		
		List<Code> list = service.selectList();
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
	public String codeGroupView(CodeVo vo, Model model) throws Exception {
		
		System.out.println("vo.getpilcgSeq():" +vo.getPilcgSeq());
		//디비까지 가서 한건의 데이터 값을 가지고온다.
		Code rt = service.selectOne(vo);
		
		//가지고 온값을 jsp로 넘겨준다
		model.addAttribute("item",rt);
		
		
		
		return "code/codeGroupView";
	}
	
}


