<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>


<form method="post" action="/infra/member/memberInst"> 

<select name=" pilmmGenderCd">
	<option value="">::성별::</option>
		<c:forEach items="${codeGender}" var="itemGender" varStatus="statusGender">
	<option value="<c:out value="${itemGender.pilcdSeq}"/>"<c:if test="${itemGender.pilmmSeq eq itemGender.pilcdSeq}">selected</c:if>> <c:out value="${itemGender.pilcdName}"></c:out></option>
		</c:forEach>	
</select>


	
	<input type="text" name="pilmmName" placeholder="이름">
	<input type="text" name="pilmmID" placeholder="이름">
	<input type="submit" value="제출">
	
</form>