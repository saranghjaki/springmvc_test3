<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>


<form method="post" action="/infra/member/memberUpdt"> 

	<input type="hidden" name="pilmmSeq" value="<c:out value="${item.pilmmSeq}"/>">
	<input type="text" name="pilmmName" placeholder="코드" value="<c:out value="${item.pilmmName}"/>">
	<input type="submit" value="제출">
	
</form>