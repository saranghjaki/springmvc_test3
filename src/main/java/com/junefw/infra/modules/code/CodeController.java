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
	
}


