<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>


<form method="post" action="/infra/member/memberInst"> 
//이주소를 호출 컨트로롤러 이주소에 해당되는 걸 찾음 
	<input type="text" name="pilmmId" placeholder="아이디">
	<input type="text" name="pilmmName" placeholder="이름">
	<input type="submit" value="제출">
	
</form>