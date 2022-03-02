package com.junefw.infra.modules.codeGroup;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/codeGroup/")	
public class CodeGroupController {
	
	@Autowired
	CodeGroupServiceImpl service;
	
	@RequestMapping(value = "codeGroupList")
//	public String memberList(@ModelAttribute("vo") MemberVo vo, Model model) throws Exception {
	public String codeGroup(Model model) throws Exception {

		List<CodeGroup> list = service.selectList();
		model.addAttribute("list", list);
	
		return "codeGroup/codeGroupList";
	}


}
