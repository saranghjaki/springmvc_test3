<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>


<form method="post" action="/infra/code/codeGroupUpdt"> 

	<input type="hidden" name="pilcgSeq" value="<c:out value="${rt.pilcgSeq}"/>">
	<input type="text" name="pilcgName" placeholder="이름" value="<c:out value="${rt.pilcgName}"/>">
	<input type="submit" value="제출">
	
</form>