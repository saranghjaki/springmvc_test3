package com.junefw.infra.modules.program;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.infra.modules.code.Code;
import com.junefw.infra.modules.code.CodeVo;

@Controller

public class ProgramController {

	@Autowired
	// new생성자기능 선언 서비스를 호출
	ProgramServiceImpl service;

	@RequestMapping(value = "/program/programList")
	public String programList(Model model) throws Exception {
		
		List<Program> list = service.selectListProgram();
		
		model.addAttribute("list", list);
		return "program/programList";
	}
	@RequestMapping(value = "/program/programForm")
	  public String programForm(Model model)
	  throws Exception {
		  List<Program> list = service.selectListProgram(); 
		model.addAttribute("list", list);
	  return "program/programForm"; 
	  
	  }
	 @RequestMapping(value = "/program/programInst") 
	  public String ProgramInst( Program dto)	  throws Exception {
	  service.insert(dto);
	  return ""; 
	  }
	  
	  @RequestMapping(value = "/program/programView") 
	  public String ProgramView(ProgramVo vo, Model model )throws Exception {
	  List<Program> list = service.selectListProgram(); //리스트타입을 리스트에 담는다
	 model.addAttribute("list", list);
	 
	 Program rt = service.selectOne(vo);
	  model.addAttribute("item",rt);

	  return "program/programView"; }

	  @RequestMapping(value = "/program/programForm2")
	  public String programForm2(ProgramVo vo, Model model ) throws Exception { //한건의 데이터를 가져오기위한 가져온값이vo에 담김
		  Program rt =   service.selectOne(vo);
	  //가져온걸 jsp에 넘겨주기위함
	  model.addAttribute("item",rt);
	  return "program/programForm2";
	  
	  }
	  
	  @RequestMapping(value = "/program/programUpdt")
	  public String programUpdt(Program dto)throws Exception {
	 	  service.update(dto);
	  
	  return ""; }
}
