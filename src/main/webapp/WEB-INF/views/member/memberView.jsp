<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>



		<c:out value="${item.pilmmSeq}"/> 
		<c:out value="${item.pilmmId}"/>
		<c:out value="${item.pilmmName}"/>
		
<a href="/infra/member/memberForm2?pilmmSeq=<c:out value="${item.pilmmSeq}"/>">수정</a>
<a href="/infra/member/memberForm?pilmmSeq=<c:out value="${item.pilmmSeq}"/>">등록</a>
