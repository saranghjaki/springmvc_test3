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
	public String memberList(MemberVo vo,Model model) throws Exception {
		int count = service.selectOneCount(vo);
		
		vo.setParamsPaging(count);
		
		if(count != 0) {
		
			List<Member> list = service.selectList(vo);
			model.addAttribute("list", list);
		}else { 
		
		}
		model.addAttribute("vo",vo);
		
		return "member/memberList";
	}
	
	@RequestMapping(value = "/member/memberForm") //
	public String memberForm(Model model) throws Exception {

		return "member/memberForm";
	}
	
	@RequestMapping(value = "/member/memberInst") 
	public String memberInst(Model model, Member dto) throws Exception {
		
		 service.insert(dto);
		
		
		return "redirect:/member/memberList";
	}
	
	@RequestMapping(value = "/member/memberView") 
	public String memberView(MemberVo vo, Model model ) throws Exception {
		
		System.out.println("vo.getPilmmSeq("+vo.getPilmmSeq()+")");
	
		Member rt = service.selectOne(vo);
		
		model.addAttribute("item",rt);
		
		
		return "member/memberView";
	}
	@RequestMapping(value = "/member/memberForm2")
	public String memberForm2(MemberVo vo, Model model) throws Exception {
		//
		Member rt = service.selectOne(vo);
		
		model.addAttribute("item", rt);
		
		return "member/memberForm2";

	}

	@RequestMapping(value = "/member/memberUpdt")
	public String memberUpdt(Member dto) throws Exception {
		
		service.update(dto);
		return "redirect:/member/memberView?PilmmSeq="+dto.getPilmmSeq();
	}
}


