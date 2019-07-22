<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<div
	uk-sticky="sel-target: .uk-navbar-container; cls-active: uk-navbar-sticky; bottom: #transparent-sticky-navbar">
	<nav class="uk-navbar-container" uk-navbar=style="position:relative; z-index: 980;">
		<div class="uk-navbar-center">
			<ul class="uk-navbar-nav uk-height-max-small">
				<li class="uk-active"><a href="#"><spring:message
							code="navbar.menu.welcome" /></a></li>
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
					</div></li>
				<li><a href="#"><spring:message code="navbar.menu.company" /></a>
					<div class="uk-navbar-dropdown">
						<ul class="uk-nav uk-navbar-dropdown-nav">
							<li class="uk-active"><a href="#"><spring:message
										code="navbar.menu.company.announcements" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.company.company.documents" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.company.company.goals" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.company.employee.directory" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.company.holiday.calendar" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.company.organisation.chart" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.company.payslips.import" /></a></li>
						</ul>
					</div></li>
				<li><a href="#"><spring:message
							code="navbar.menu.configure" /></a>
					<div class="uk-navbar-dropdown">
						<ul class="uk-nav uk-navbar-dropdown-nav">
							<li class="uk-active"><a href="#"><spring:message
										code="navbar.menu.configure.plan.and.billing" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.configure.settings" /></a></li>
						</ul>
					</div></li>
				<li><a href="#"><spring:message code="navbar.menu.help" /></a>
					<div class="uk-navbar-dropdown">
						<ul class="uk-nav uk-navbar-dropdown-nav">
							<li class="uk-active"><a href="#"><spring:message
										code="navbar.menu.help.knowledge.base" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.help.getting.started" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.help.enable.support" /></a></li>
							<li><a href="#"><spring:message
										code="navbar.menu.help.hr.advice" /></a></li>
						</ul>
					</div></li>
			</ul>
		</div>
	</nav>
</div>