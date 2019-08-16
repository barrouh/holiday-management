<%@ include file="/WEB-INF/views/include.jsp"%>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <title>
            <spring:message code="website.title" />
        </title>
        <spring:url value="/resources/images/favicon.ico" var="favicon" />
        <spring:url value="/resources/themes/uikit/uikit.min.css" var="uikitCss" />
        <spring:url value="/resources/themes/uikit/uikit-rtl.min.css" var="uikitRtlCss" />
        <spring:url value="/resources/themes/main.css" var="mainCss" />
        <link rel="shortcut icon" href="${favicon}" type="image/vnd.microsoft.icon" />
        <link href="${uikitCss}" rel="stylesheet" />
        <link href="${uikitRtlCss}" rel="stylesheet" />
        <link href="${mainCss}" rel="stylesheet" />
    </head>

    <div uk-sticky="sel-target: .uk-navbar-container; cls-active: uk-navbar-sticky">
        <nav class="uk-navbar-container uk-animation-fade" id="header-section-personal" uk-navbar>
            <div class="uk-navbar-left" id="header-section-personal">
                <a class="uk-navbar-toggle" id="navbar-toggle-personal" <c:if test = "${sessionScope.userApp.logged}"> uk-navbar-toggle-icon  </c:if> href="#offcanvas-push" uk-toggle="target: #offcanvas-push"></a>
                <div class="uk-section uk-section-xsmall">
                    <h3 class="uk-heading-xsmall">
					<a class="uk-link-reset" id="header-title-personal" href="/"><spring:message
							code="header.title" /></a>
							<span class="logged-user" id="header-title-personal">
				  <c:if test = "${sessionScope.userApp.logged}">
				         <span uk-icon="icon: user; ratio: 1.5"></span>
			             <span><c:out value = "${sessionScope.userApp.employee.username}"/></span>
			             <a href="/logout" uk-icon="icon:  sign-out; ratio: 1.5"></a>
			      </c:if>
				</span> 
				</h3>
                </div>
				<tags:navbar/>
            </div>
        </nav>
    </div>