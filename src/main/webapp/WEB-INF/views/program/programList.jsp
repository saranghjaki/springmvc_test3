<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<c:choose>
	<c:when test="${fn:length(list) eq 0}">
		<tr>
			<td class="text-center" colspan="9">There is no data!</td>
		</tr>	
	</c:when>
	<c:otherwise>
	
		<c:forEach items="${list}" var="item" varStatus="status">	
		<c:out value="${item.pilpgSeq}"/> 
		
		<a href="/infra/program/programView?pilpgSeq=<c:out value="${item.pilpgSeq}"/>">
		<c:out value="${item.pilpgName}"/></a>
		<c:out value="${item.pilpgTypeCd}"/> 
		<c:out value="${item.pilpgTimeCd}"/>
		<c:out value="${item.pilpgNumberCd}"/>
		<c:out value="${item.pilpgPrice}"/>
		<c:out value="${item.pilpgDelNy}"/>
	
		<br>


		
		</c:forEach>
	</c:otherwise>
</c:choose>	

