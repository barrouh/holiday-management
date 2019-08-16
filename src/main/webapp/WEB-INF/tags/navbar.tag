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

    <div id="offcanvas-push" uk-offcanvas="mode: push; overlay: true">
        <div id="navbar-section-personal" class="uk-offcanvas-bar uk-animation-fade">
            <button class="uk-offcanvas-close" type="button" uk-close></button>
            <ul class="uk-nav uk-nav-default">
                <h3 class="uk-heading-divider">
							<li id="nav-header-personal" class="uk-nav-header"><spring:message
									code="navbar.menu.employees" /></li>
						</h3>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.employees.list" />
                    </a>
                </li>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.employees.add.new" />
                    </a>
                </li>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.employees.data" />
                    </a>
                </li>
                <h3 class="uk-heading-divider">
							<li id="nav-header-personal" class="uk-nav-header"><spring:message
									code="navbar.menu.projects" /></li>
						</h3>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.projects.list" />
                    </a>
                </li>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.projects.add.new" />
                    </a>
                </li>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.projects.data" />
                    </a>
                </li>
                <h3 class="uk-heading-divider">
							<li id="nav-header-personal" class="uk-nav-header"><spring:message
									code="navbar.menu.company" /></li>
						</h3>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.company.announcements" />
                    </a>
                </li>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.company.company.documents" />
                    </a>
                </li>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.company.company.goals" />
                    </a>
                </li>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.company.employee.directory" />
                    </a>
                </li>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.company.holiday.calendar" />
                    </a>
                </li>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.company.organisation.chart" />
                    </a>
                </li>
                <li>
                    <a href="#">
                        <spring:message code="navbar.menu.company.payslips.import" />
                    </a>
                </li>
            </ul>
        </div>
    </div>