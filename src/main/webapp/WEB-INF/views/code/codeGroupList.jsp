<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<form id="" name="" method="get" action="/infra/code/codeGroupList">
<select name="shPilcgDelNy">
	<option value="">::삭제여부::
	<option value="1">::Y::
	<option value="0">::N::
</select>

회원이름: <input type="text" name="shPilcgName">

<select name="shOption">
	<option value="">::검색구분::
	<option value="1">::한글::
	<option value="2">::영문::
</select>
회원이름: <input type="text" name="shValue">
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
		
		<c:out value="${item.pilcgSeq}"/> |
		 <a href="/infra/code/codeGroupView?pilcgSeq=<c:out value="${item.pilcgSeq}"/>">
		<c:out value="${item.pilcgName}"/></a> <c:out value="${item.pilcgNameEng}"/>
		| <c:out value="${item.pilcgDelNy}"/> <br>
		
		</c:forEach>
	</c:otherwise>
</c:choose>	
</form>
