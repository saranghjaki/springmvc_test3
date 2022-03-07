package com.junefw.infra.modules.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junefw.infra.modules.code.Code;
import com.junefw.infra.modules.code.CodeVo;

@Controller
public class MemberController {

	@Autowired
	MemberServiceImpl service;
	
	@RequestMapping(value = "/member/memberList")
//	public String memberList(@ModelAttribute("vo") MemberVo vo, Model model) throws Exception {
	public String memberList(Model model) throws Exception {
		
		List<Member> list = service.selectList();
		model.addAttribute("list", list); //jsp 함수로 넘겨줌
			//list데이터들이 아래에 리턴 (담겨짐)
		return "member/memberList";
	}
	
	@RequestMapping(value = "/member/memberForm") //
	public String memberForm(Model model) throws Exception {

		return "member/memberForm";
	}
	
	@RequestMapping(value = "/member/memberInst") 
	public String memberInst(Model model, Member dto) throws Exception {
		
		/*
		 * System.out.println("dto.getpilmmId(): " + dto.getPilmmId());
		 * System.out.println("dto.getpilmmName(): " + dto.getPilmmName());
		 */

		// 입력을 작동시킨다.
		/* int result = */ service.insert(dto);
		
		/* System.out.println("result: " + result); */

		return "";
	}
	
	@RequestMapping(value = "/member/memberView") 
	public String cmemberView(MemberVo vo, Model model ) throws Exception {
		
		System.out.println("vo.getPilmmSeq("+vo.getPilmmSeq()+")");
	
		Member rt = service.selectOne(vo);
		
		model.addAttribute("rt",rt);
		
		
		return "member/memberView";
	}
	
}


