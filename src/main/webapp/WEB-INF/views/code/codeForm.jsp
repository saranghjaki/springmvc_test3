<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>


<form method="post" action="/infra/code/codeInst"> 

<select name="pilcgSeq">

	<option value="${item.pilcgSeq}">::코드그룹::</option>
<c:forEach items="${listCodeGroup}" var="item" varStatus="status">			
	<option value="<c:out value="${item.pilcgSeq}"/>"><c:out value="${item.pilcgSeq}"/> | <c:out value="${item.pilcgName}"/></option>
		</c:forEach>	
	</select>
	
    
    <input type="text" name="ifcdName" placeholder="pilcdName">
    <input type="submit" value="제출">
</form>

