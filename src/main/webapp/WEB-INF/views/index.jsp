<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="ctx" value="<%=request.getContextPath() %>" scope="application" />
<!DOCTYPE html>
<html lang="<spring:message code="lang" />">
<head>
<meta charset="UTF-8" />
<title><spring:message code="homepage" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="Keywords" content="Spring MVC,JSTL core,Context Path," />
<meta name="Description" content="Spring JSP MVC Testing" />
<link rel="stylesheet" media="screen" href="${ctx}/static/css/screen.css" />
</head>
<body>
<h6><spring:message code="homepage" /></h6>

</body>
</html>