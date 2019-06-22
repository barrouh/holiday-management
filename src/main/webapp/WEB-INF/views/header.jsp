<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Holiday Management</title>
		<spring:url value="/resources/core/img/favicon.ico" var="favicon" />
		<link rel="shortcut icon" href="${favicon}" type="image/vnd.microsoft.icon" />
		<spring:url value="/resources/core/css/main.css" var="coreCss" />
		<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
		<link href="${bootstrapCss}" rel="stylesheet" />
		<link href="${coreCss}" rel="stylesheet" />
	</head>