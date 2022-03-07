<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>


<c:out value="${rt.pilcgSeq}"/> 
<c:out value="${rt.pilcgName}"/>
<c:out value="${rt.pilcgDelNy}"/> 
<!-- <a href ="../infra/code/codeGroupForm">수정</a> -->

<a href="/infra/code/codeGroupForm2?pilcgName=<c:out value="${rt.pilcgName}"/>">수정</a>