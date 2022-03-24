<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>


<c:out value="${item.pilcgSeq}"/> 
<c:out value="${item.pilcgName}"/>
<c:out value="${item.pilcgDelNy}"/> 
<!-- <a href ="../infra/code/codeGroupForm">수정</a> -->

<a href="/infra/code/codeGroupList?thisPage=${vo.thisPage}&shOption=<c:out value="${vo.shOption}"/>&shValue=<c:out value="${vo.shValue}"/>">목록</a>
<a href="/infra/code/codeGroupForm2?pilcgSeq=<c:out value="${item.pilcgSeq}"/>&thisPage=${vo.thisPage}&shOption=<c:out value="${vo.shOption}"/>&shValue=<c:out value="${vo.shValue}"/>">수정</a>

<a href="/infra/code/codeGroupForm2?pilcgSeq=<c:out value="${item.pilcgSeq}"/>"> 수정</a>
<a  href="/infra/code/codeGroupDele?pilcgSeq=<c:out value="${item.pilcgSeq}"/>&thisPage=${vo.thisPage}&shOption=<c:out value="${vo.shOption}"/>&shValue=<c:out value="${vo.shValue}"/>"id="btnDelete" > 삭제(진짜)</a>
<a href="/infra/code/codeGroupNele?pilcgSeq=<c:out value="${item.pilcgSeq}"/>&thisPage=${vo.thisPage}&shOption=<c:out value="${vo.shOption}"/>&shValue=<c:out value="${vo.shValue}"/>"id="btnDelete1"> 삭제(가짜)</a>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$("#btnDelete").on("click", function(){
		var answer = confirm("삭제하시겠습니까");
		if(answer){
		
		
		}else{
	
			return false;
		}
	});
	$("#btnDelete1").on("click", function(){
		var answer = confirm("가짜삭제하시겠습니까");
		if(answer){
		
		
		}else{
	
			return false;
		}
	});
</script>