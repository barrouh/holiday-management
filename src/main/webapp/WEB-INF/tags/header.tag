<%@ include file="/WEB-INF/views/include.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title><spring:message code="website.title" /></title>

<spring:url value="/resources/images/favicon.ico" var="favicon" />
<link rel="shortcut icon" href="${favicon}"
	type="image/vnd.microsoft.icon" />
<%-- <spring:url value="/resources/themes/bootstrap/bootstrap.min.css" var="bootstrapCss" /> --%>
<spring:url value="/resources/themes/uikit/uikit.min.css" var="uikitCss" />
<spring:url value="/resources/themes/uikit/uikit-rtl.min.css"
	var="uikitRtlCss" />
<spring:url value="/resources/themes/main.css" var="mainCss" />
<%-- <link href="${bootstrapCss}" rel="stylesheet" /> --%>
<link href="${uikitCss}" rel="stylesheet" />
<link href="${uikitRtlCss}" rel="stylesheet" />
<link href="${mainCss}" rel="stylesheet" />
</head>

<div class="uk-section uk-section-xsmall uk-animation-fade"
	id="header-section-personal">
	<div class="uk-container  uk-container-large">
		<h3 class="uk-heading-xsmall">
			<a class="uk-link-reset" id="header-title-personal" href="/"><spring:message
					code="header.title" /></a>
		</h3>
	</div>
</div>