package com.junefw.infra.modules.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.infra.modules.code.Code;
import com.junefw.infra.modules.code.CodeVo;

@Controller

public class CodeController {

	@Autowired
	// new생성자기능 선언 서비스를 호출
	CodeServiceImpl service;

	@RequestMapping(value = "/code/codeGroupList")
	public String codeGroupList(Model model) throws Exception {
		// 호출한 서비스 결과를 리스트에 담는다
		List<Code> list = service.selectList();
		// 리스트타입을 리스트에 담는다
		model.addAttribute("list", list);
		return "code/codeGroupList";
	}

	@RequestMapping(value = "/code/codeGroupForm")
	public String codeGroupForm(Model model) throws Exception {
		return "code/codeGroupForm";
	}
	@RequestMapping(value = "/code/codeGroupInst")
	public String codeGroupInst(Code dto) throws Exception {
		service.insert(dto);
		return "";
	}

	@RequestMapping(value = "/code/codeGroupView")
	public String codeGroupView(CodeVo vo, Model model) throws Exception {
		System.out.println("vo.getPilcgSeq(" + vo.getPilcgSeq() + ")");
		// 디비까지 가서 한건의 데이터 값을 가지고온다.
		Code rt= service.selectOne(vo);
		
		// 가지고 온값을 jsp로 넘겨준다
		model.addAttribute("item", rt);
		return "code/codeGroupView";
	}

	@RequestMapping(value = "/code/codeGroupForm2")
	public String codeGroupForm2(CodeVo vo, Model model) throws Exception {
		// 한건의 데이터를 가져오기위한 가져온값이vo에 담김
		Code rt = service.selectOne(vo);
		// 가져온걸 jsp에 넘겨주기위함
		model.addAttribute("item", rt);
		return "code/codeGroupForm2";

	}

	@RequestMapping(value = "/code/codeGroupUpdt")
	public String codeGroupUpdt(Code dto) throws Exception {
		System.out.println("dto.getPilcgSeq(" + dto.getPilcgSeq() + ")");
		System.out.println("dto.getPilcgSeq(" + dto.getPilcgName() + ")");
		service.update(dto);
		return "";
	}

	/* Code s */
	
	  @RequestMapping(value = "/code/codeList")
	  public String codeList(Model model) throws Exception { //호출한 서비스 결과를 리스트에 담는다
	  List<Code> list = service.selectList1(); //리스트타입을 리스트에 담는다
	  model.addAttribute("list", list);
	  return "code/codeList"; 
	  }
	  
	  @RequestMapping(value = "/code/codeForm")
	  public String codeForm(Model model)
	  throws Exception {
		  List<Code> list = service.selectList(); //리스트타입을 리스트에 담는다
		model.addAttribute("list", list);
	  return "code/codeForm"; 
	  
	  }
	  
	  
	  
	  @RequestMapping(value = "/code/codeInst") 
	  public String codeInst( Code dto)	  throws Exception {
	  service.insert1(dto);
	  return ""; 
	  }
	  
	  @RequestMapping(value = "/code/codeView") 
	  public String codeView(CodeVo vo, Model model )throws Exception {
	  List<Code> list = service.selectList(); //리스트타입을 리스트에 담는다
	 model.addAttribute("list", list);
	 
	  Code rt = service.selectOne1(vo);
	  model.addAttribute("item",rt);
 
	  return "code/codeView"; }
	  
	  @RequestMapping(value = "/code/codeForm2")
	  public String codeForm2(CodeVo vo, Model model ) throws Exception { //한건의 데이터를 가져오기위한 가져온값이vo에 담김
	 Code rt =   service.selectOne1(vo);
	  //가져온걸 jsp에 넘겨주기위함
	  model.addAttribute("item",rt);
	  return "code/codeForm2";
	  
	  }
	  
	  @RequestMapping(value = "/code/codeUpdt")
	  public String codeUpdt(Code dto)throws Exception {
	 	  service.update1(dto);
	  
	  return ""; }
	 
}
