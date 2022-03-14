<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

codelist
<form id="" name="" method="get" action="/infra/code/codeList">
<select name="shPilcgSeq">
	<option value="">::코드그룹::</option>
		<c:forEach items="${listCodeGroup}" var="item" varStatus="status">	
	<option value="<c:out value="${item.pilcgSeq}"/>"<c:if test="${param.shPilcgSeq eq item.pilcgSeq}">selected</c:if>> <c:out value="${item.pilcgName}"></c:out></option>
		</c:forEach>	
</select>
<input type="submit" name="search">
<br>

<c:choose>
	<c:when test="${fn:length(list) eq 0}">
		<tr>
			<td class="text-center" colspan="9">There is no data!</td>
		</tr>	
	</c:when>
	<c:otherwise>
		<c:forEach items="${list}" var="item" varStatus="status">	
		
	 	<c:out value="${item.pilcdSeq}"/> | <c:out value="${item.pilcgSeq}"/>  | <a href="/infra/code/codeView?pilcdSeq=${item.pilcdSeq}"><c:out value="${item.pilcdName}"/></a> <br>
		 
		
		
		</c:forEach>
	</c:otherwise>
</c:choose>	
</form>