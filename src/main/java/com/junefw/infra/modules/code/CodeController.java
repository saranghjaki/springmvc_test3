package com.junefw.infra.modules.code;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/code/")	
public class CodeController {
	
	@Autowired //서비스 임플부름
	CodeServiceImpl service;
	
	@RequestMapping(value = "/codeGroupList")
	public String codeGroupList(Model model) throws Exception {

		List<Code> list = service.selectList();
		model.addAttribute("list", list);
	
		return "code/codeGroupList";
	}

}
