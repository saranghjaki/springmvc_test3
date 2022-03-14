<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<form method="get" ation="/">
회원이름 : <input type ="text" name="shPilcdSeq">
<input type ="submit" name="serch">
<br>
<c:out value="${item.pilcdSeq}"/> 
<c:out value="${item.pilcdName}"/>
<c:out value="${item.pilcdDelNy}"/> 
</form>

<a href="/infra/code/codeForm2?pilcdSeq=<c:out value="${item.pilcdSeq}"/>">수정</a>
<a href="/infra/code/codeForm?pilcgSeq=<c:out value="${item.pilcgSeq}"/>">등록</a>