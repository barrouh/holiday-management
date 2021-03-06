<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include.jsp"%>

<tags:header />
<body>
      <c:if test = "${sessionScope.userApp.logged}">
        <div class="uk-section uk-section-xsmall uk-section-muted uk-animation-fade">
            <div class="uk-container uk-container-large uk-width-5-6 uk-section-default uk-box-shadow-medium uk-padding">
                <div>
                    <a href="/addEmployee" class="uk-icon-link uk-margin-small-right uk-align-right" uk-icon="icon: plus-circle; ratio: 2" uk-tooltip="Add a new employee"></a>
                    <h2 class="uk-heading-line">
				<spring:message code="employees.header" />
			</h2>
            <hr>
                </div>
                    <div class="uk-overflow-auto">
                        <table class="uk-table uk-table-hover uk-table-small uk-table-divider">
                            <thead id="table-th-personal">
                                <tr>
                                    <th>
                                        <spring:message code="employee.first.name" />
                                    </th>
                                    <th>
                                        <spring:message code="employee.last.name" />
                                    </th>
                                    <th>
                                        <spring:message code="employee.user.name" />
                                    </th>
                                    <th>
                                        <spring:message code="employee.address.mail" />
                                    </th>
                                    <th>
                                        <spring:message code="employee.grade" />
                                    </th>
                                    <th>
                                        <spring:message code="employee.project" />
                                    </th>
                                    <th>
                                        <spring:message code="employee.supervisor" />
                                    </th>
                                    <th>
                                        <spring:message code="employee.initial.days" />
                                    </th>
                                    <th>
                                        <spring:message code="employee.available.days" />
                                    </th>
                                    <c:if test = "${sessionScope.userApp.hasSupervisorAccess}">
                                    <th>
                                        <spring:message code="actions" />
                                    </th>
                                    </c:if>
                                </tr>
                            </thead>
                            <c:if test="${not empty employers}">
                                <c:forEach items="${employers}" var="employer">
                                    <tbody style="border: 1px solide black;">
                                        <tr>
                                            <td class="uk-text-truncate">${employer.firstName}</td>
                                            <td class="uk-text-truncate">${employer.lastName}</td>
                                            <td class="uk-text-truncate">${employer.username}</td>
                                            <td class="uk-text-nowrap">${employer.mailAdress}</td>
                                            <td class="uk-text-nowrap">${employer.grade}</td>
                                            <td class="uk-text-truncate">${employer.project.projectName}</td>
                                            <td class="uk-text-truncate">${employer.supervisor.username}</td>
                                            <td class="uk-text-truncate">${employer.initialBalance}</td>
                                            <td class="uk-text-truncate">${employer.currentBalance}</td>
                                            <c:if test = "${sessionScope.userApp.hasSupervisorAccess}">
                                            <td class="uk-text-nowrap">
                                                <a href="editEmployee?employeeId=${employer.employeeId}" class="uk-icon-link uk-margin-small-right" uk-icon="file-edit" uk-tooltip="Edit">Edit</a>
                                                <a href="editEmployee?employeeId=${employer.employeeId}" class="uk-icon-link" uk-icon="trash" uk-tooltip="Delete">Delete</a>
                                            </td>
                                            </c:if>
                                        </tr>
                                    </tbody>
                                </c:forEach>
                            </c:if>
                        </table>
                    </div>
            </div>
        </div>
         </c:if>
         <c:if test = "${!sessionScope.userApp.logged}">
           <c:redirect url="/"/>
         </c:if>
        </body>
<tags:footer />