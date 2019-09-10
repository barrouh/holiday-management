    <%@ include file="/WEB-INF/views/include.jsp"%>
    <div id="offcanvas-push" uk-offcanvas="mode: push; overlay: true">
        <div id="navbar-section-personal" class="uk-offcanvas-bar uk-animation-fade">
            <button class="uk-offcanvas-close" type="button" uk-close></button>
            <ul class="uk-nav uk-nav-default">
                <h3 class="uk-heading-divider">
				  <li id="nav-header-personal" class="uk-nav-header">
				  <spring:message code="navbar.menu.employees" />
				  </li>
				</h3>
                <li>
                    <a href="/employees">
                        <spring:message code="navbar.menu.employees.list" />
                    </a>
                </li>
                <li>
                    <a href="/addEmployee">
                        <spring:message code="navbar.menu.employees.add.new" />
                    </a>
                </li>
                <li>
                    <a href="">
                        <spring:message code="navbar.menu.employees.data" />
                    </a>
                </li>
                 <h3 class="uk-heading-divider">
				  <li id="nav-header-personal" class="uk-nav-header">
				  <spring:message code="navbar.menu.holidays" />
				  </li>
				</h3>
                <li>
                    <a href="/holidays">
                        <spring:message code="navbar.menu.holidays.list" />
                    </a>
                </li>
                <li>
                    <a href="/requestHoliday">
                        <spring:message code="navbar.menu.holidays.add.new" />
                    </a>
                </li>
                <li>
                    <a href="">
                        <spring:message code="navbar.menu.holidays.data" />
                    </a>
                </li>
                <h3 class="uk-heading-divider">
							<li id="nav-header-personal" class="uk-nav-header"><spring:message
									code="navbar.menu.projects" /></li>
						</h3>
                <li>
                    <a href="/projects">
                        <spring:message code="navbar.menu.projects.list" />
                    </a>
                </li>
                <li>
                    <a href="/addProject">
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