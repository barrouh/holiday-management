<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <spring:url value="/resources/core/js/main.js" var="coreJs" />
	<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs" />
	<spring:url value="/resources/core/js/jquery.min.js" var="jqueryJs" />
	<spring:url value="/resources/core/js/angular.min.js" var="angularJs" />
	<script src="${jqueryJs}"></script>
	<script src="${bootstrapJs}"></script>
	<script src="${coreJs}"></script>
	<script src="${angularJs}"></script>
<footer>
	<p>© everis.com 2019</p>
</footer>
</html>