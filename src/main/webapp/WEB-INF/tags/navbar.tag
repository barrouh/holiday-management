<%@ include file="/WEB-INF/views/include.jsp"%>

<div
	uk-sticky="sel-target: .uk-navbar-container; cls-active: uk-navbar-sticky; bottom: #transparent-sticky-navbar">
	<nav class="uk-navbar-container" uk-navbar=style="position:relative; z-index: 980;">
		<div class="uk-navbar-center">
			<ul class="uk-navbar-nav uk-height-max-small">
				<li class="uk-active"><a href="/"><spring:message
							code="navbar.menu.account" /></a></li>
				<li><a href="#"><spring:message
							code="navbar.menu.dashboard" /></a></li>
				<li><a href="#"><spring:message
							code="navbar.menu.employees" /></a>
					<div class="uk-navbar-dropdown">
						<ul class="uk-nav uk-navbar-dropdown-nav">
							<li class="uk-active"><a href="#"><spring:message
										code="navbar.menu.employees.list" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.employees.directory" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.employees.add.new" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.employees.data" /></a></li>
						</ul>
					</div></li>
				<li><a href="#"><spring:message
							code="navbar.menu.recruitment" /></a>
					<div class="uk-navbar-dropdown">
						<ul class="uk-nav uk-navbar-dropdown-nav">
							<li class="uk-active"><a href="#"><spring:message
										code="navbar.menu.recruitment.open.vacancies" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.recruitment.all.vacancies" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.recruitment.applicants" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.recruitment.applicant.archive" /></a></li>
						</ul>
					</div></li>
				<li><a href="#"><spring:message
							code="navbar.menu.reporting" /></a>
					<div class="uk-navbar-dropdown">
						<ul class="uk-nav uk-navbar-dropdown-nav">
							<li class="uk-active"><a href="#"><spring:message
										code="navbar.menu.reporting.reports" /></a></li>
						</ul>
					</div>
					</li>
				<li><a href="#"><spring:message code="navbar.menu.company" /></a>
					<div class="uk-navbar-dropdown">
						<ul class="uk-nav uk-navbar-dropdown-nav">
							<li class="uk-active"><a href="#"><spring:message code="navbar.menu.reporting.reports" /></a></li>
						</ul>
					</div></li>
			</ul>
		</div>
	</nav>
</div>