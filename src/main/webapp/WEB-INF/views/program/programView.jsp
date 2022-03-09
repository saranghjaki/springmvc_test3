<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>



		<c:out value="${item.pilpgSeq}"/> 
		<c:out value="${item.pilpgName}"/> 
		<c:out value="${item.pilpgTypeCd}"/>
		<c:out value="${item.pilpgTimeCd}"/>
		<c:out value="${item.pilpgNumberCd}"/>
		<c:out value="${item.pilpgPrice}"/>
		
		<br>


<a href="/infra/program/programForm2?pilpgSeq=<c:out value="${item.pilpgSeq}"/>">수정</a>
<a href="/infra/program/programForm?pilpgSeq=<c:out value="${item.pilpgSeq}"/>">등록</a>