<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="ctx" value="<%=request.getContextPath() %>" scope="application" />
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>홈페이지</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="Keywords" content="Spring MVC,JSTL core,Context Path," />
<meta name="Description" content="스프링 MVC 테스트를 위한 JSP 파일" />
<link rel="stylesheet" media="screen" href="${ctx}/static/css/screen.css" />
</head>
<body>
<h6>홈페이지</h6>
<!--스프링 폼 태그 테스트 -->
<!--
fullName
google email account
password
sex(M|F)
AI
skills
locale
notes			 
-->

<form:form>
	<table>
		<tr>
			<td>Full Name:</td>
			<td><form:input path="fullName"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Submit"/>
			</td>
		</tr>
	</table>
</form:form>

</body>
</html>
