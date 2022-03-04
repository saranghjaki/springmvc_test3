<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<table border="1" height="200px" >
	<tr>
		<th>순서</th>
		<th>아이디</th>
		<th>이름</th>
		<th>생년월일</th>
		
	</tr>
		<td><c:out value="${rt.pilmmSeq}"/> </td>
		<td><c:out value="${rt.pilmmId}"/></td>
		<td><c:out value="${rt.pilmmName}"/></td>
		<td><c:out value="${rt.pilmmDob}"/></td>

</table>