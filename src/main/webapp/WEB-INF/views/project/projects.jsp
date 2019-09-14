<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include.jsp"%>
<tags:header />
<body>
<c:if test = "${sessionScope.userApp.logged}">
<%-- list of all projects--%>
        <div class="uk-section uk-section-xsmall uk-section-muted uk-animation-fade">
            <div class="uk-container uk-container-large uk-width-5-6 uk-section-default uk-box-shadow-medium uk-padding">
                <div>
                    <a href="/addProject" class="uk-icon-link uk-margin-small-right uk-align-right" uk-icon="icon: plus-circle; ratio: 2" uk-tooltip="Add a new project"></a>
                    <h2 class="uk-heading-line">
				<spring:message code="Projects.header" />
			</h2>
            <hr>
                </div>
                <form method="GET" action="">
                    <div class="uk-overflow-auto">
                        <table class="uk-table uk-table-hover uk-table-small uk-table-divider">
                            <thead id="table-th-personal">
                                <tr>
                                    <th>
                                        <spring:message code="project.id" />
                                    </th>
                                    <th>
                                        <spring:message code="project.name" />
                                    </th>
                                    <th>
                                        <spring:message code="project.description" />
                                    </th>
                                    <c:if test = "${sessionScope.userApp.hasSupervisorAccess}">
                                    <th>
                                        <spring:message code="actions" />
                                    </th>
                                    </c:if>
                                </tr>
                            </thead>
                            <c:if test="${not empty projects}">
                                <c:forEach items="${projects}" var="project">
                                    <tbody>
                                        <tr>
                                            <td class="uk-text-truncate">${project.projectId}</td>
                                            <td class="uk-text-truncate">${project.projectName}</td>
                                            <td class="uk-text-truncate">${project.description}</td>
                                            <c:if test = "${sessionScope.userApp.hasSupervisorAccess}">
                                            <td class="uk-text-truncate">
                                            	<a href="editProject?projectId=${project.projectId}" class="uk-icon-link uk-margin-small-right" uk-icon="file-edit" uk-tooltip="Edit">Edit</a> 
                                            	<a href="deleteProject?projectId=${project.projectId}" class="uk-icon-link" uk-icon="trash" uk-tooltip="Delete">Delete</a>
                                            </td>
                                            </c:if>
                                        </tr>
                                    </tbody>
                                </c:forEach>
                            </c:if>
                        </table>
                    </div>
                </form>
            </div>
        </div>
          </c:if>
         <c:if test = "${!sessionScope.userApp.logged}">
           <c:redirect url="/"/>
         </c:if>
       </body>
<tags:footer />