
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
                      
<form id="" name="" method="get" action="/infra/code/codeGroupList">
<select name="shPilcgDelNy"id="shPilcgDelNy" >
	<option value="">::삭제여부::
	<option value="1"<c:if test="${vo.shPilcgDelNy eq 1 }">selected</c:if>>::Y::
	<option value="0"<c:if test="${vo.shPilcgDelNy eq 0 }">selected</c:if>>::N::
</select>

코드이름: <input type="text" name="shPilcgName" id="shPilcgName" value="<c:out value ="${vo.shPilcgName }"/>">

<select name="shOption" id="shOption">
	<option value="">::검색구분::
	<option value="1"<c:if test="${vo.shOption eq 1 }">selected</c:if>>::한글::
	<option value="2"<c:if test="${vo.shOption eq 2 }">selected</c:if>>::영문::
</select>

 <input type ="text" name="shValue" id= "shValue" value="<c:out value = "${vo.shValue }"/>">
<input type="submit" id="btnSubmit" name="search">
<input type="submit" id="btnSubmit2" name="search">
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

<c:out value="${vo.startPage}"/>
<c:out value="${vo.endPage}"/>
<c:out value="${vo.startPage}"/>

<nav aria-label="...">
  <ul class="pagination">
  
		<c:if test="${vo.startPage gt vo.pageNumToShow}">
		                <li class="page-item"><a class="page-link" href="/infra/code/codeGroupList?thisPage=${vo.startPage - 1}">Previous</a></li>
		</c:if>
		<c:forEach begin="${vo.startPage}" end="${vo.endPage}" varStatus="i">
			<c:choose>
				<c:when test="${i.index eq vo.thisPage}">
		                <li class="page-item active"><a class="page-link" href="/infra/code/codeGroupList?thisPage=${i.index}">${i.index}</a></li>
				</c:when>
				<c:otherwise>             
		                <li class="page-item"><a class="page-link" href="/infra/code/codeGroupList?thisPage=${i.index}">${i.index}</a></li>
				</c:otherwise>
			</c:choose>
		</c:forEach>     
		<c:if test="${vo.endPage ne vo.totalPages}">                
		                <li class="page-item"><a class="page-link" href="/infra/code/codeGroupList?thisPage=${vo.endPage + 1}">Next</a></li>
		</c:if>  
  </ul>
</nav>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script >

<script type ="text/javascript">
	$("#btnSubmit").on("click",funtion(){
		/* alert($("#shOption").val()); */
		
		alert($("#shPilName").val());  //jquery 방식
		confirm("진짜 삭제하시겠습니까?");
	});
</script> -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="/infra/resources/js/validation.js"></script>

<script type="text/javascript">
	$("#btnSubmit").on("click",function(){
		//이벤트 click / change->seletbox 변경되었을때 /
	/* 	if($("#shPilcgName").val() == "" || $("#shPilcgName").val() == null){
			alert("unll이다");
			$("#shPilcgName").focus();
		}  */
		if(!checkNull($("#shPilcgName"),$("#shPilcgName").val(),"name입력해주세요")) return false;
		if(!checkNull($("#shPilcgName"),$("#shPilcgName").val(),"검색어를 입력해주세요")) return false;
		if(!checkNull($("#shValue"),$("#shValue").val(),"값이 입력되지 않았습니다 name입력해주십시오")) return false;
		if(!checkNull($("#shPilcgDelNy"),$("#shPilcgDelNy").val(),"삭제여부체크해주세요")) return false;
		if(!checkNull($("#shOption"),$("#shOption").val(),"검색구분체크해주세요")) return false;
		
		 
			  
		/* alert($("#shOption").val()); */
		/* alert("jquery:"+ $("#shPilcgName").val() );
		alert("jquery:"+ $("#shPilcgName").val("회원") );
		alert("jquery:"+ $("#shPilcgName").val() );
 */		//처음에 값을 보여주고 값을 2로 바꿈
		/* alert("jquery:"+ $("#shPilcgName").val() );	//jquery방식 id쓰는곳
		alert("jquery:"+ $("input[name ==shPilcgName]").val() );	//jquery방식 id안쓸때
		alert("jquery:"+ $("#shPilcgDelNy").val() );		//jquery방식
		alert("javascript:"+document.getElementById("shPilcgName").value );		//javascript방식
		alert("javascript:"+document.getElementById("shPilcgDelNy").value );		//javascript방식 */
	});

	
	$("#btnSubmit2").on("click",function(){
		alert("두번째버튼입니다")
	});
</script>


 
