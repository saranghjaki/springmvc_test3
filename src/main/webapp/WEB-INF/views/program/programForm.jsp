<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>


<form method="post" action="/infra/code/codeInst"> 



	
	<input type="text" name="pilpgName" placeholder="프로그램이름">
	<input type="text" name="pilpgTypeCd" placeholder="프로그램타입">
	<input type="text" name="pilpgTimeCd" placeholder="프로그램시간">
	<input type="text" name="pilpgNumberCd" placeholder="프로그램횟수">
	<input type="text" name="pilpgPrice" placeholder="프로그램가격">
	
	<input type="submit" value="수정">
	
</form>