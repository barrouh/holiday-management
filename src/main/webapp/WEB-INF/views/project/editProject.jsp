<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include.jsp"%>
<tags:header />
<body>
<c:if test = "${sessionScope.userApp.logged && sessionScope.userApp.hasSupervisorAccess}">
<%-- edit project--%>
        <section class="uk-section uk-section-muted uk-animation-fade">
            <div class="uk-container uk-width-1-3 uk-section-default uk-box-shadow-xlarge uk-padding">
                <div>
                    <h3 class="uk-heading-line">
				<spring:message code="project.details" />
			</h3>
		    <hr>
                </div>
                <form method="POST" action="/editProject" class="">
                    <div class="uk-margin">
                        <input class="uk-input" name="projectId" type="text" placeholder="<spring:message code="project.id" />" value="${updatedProject.projectId}">
                        <input class="uk-input" name="oldProjectId" type="hidden" placeholder="<spring:message code="project.id" />" value="${updatedProject.projectId}">
                    </div>
                    <div class="uk-margin">
                        <input class="uk-input" name="projectName" type="text" placeholder="<spring:message code="project.name" />" value="${updatedProject.projectName}">
                    </div>
                    <div class="uk-margin">
                        <input class="uk-input" name="projectDescription" type="text" placeholder="<spring:message code="project.description" />" value="${updatedProject.description}">
                    </div>
                    <hr>
                    <div class="uk-align-right">
                        <button type="reset" class="uk-button uk-button-default" id="form-button-cancel-personal">
                            <spring:message code="button.cancel" />
                        </button>
                        <button type="submit" class="uk-button uk-button-primary" id="form-button-add-personal">
                            <spring:message code="project.form.button.edit.project" />
                        </button>
                    </div>
                </form>
            </div>
        </section>
         </c:if>
          <c:if test="${!sessionScope.userApp.hasSupervisorAccess}">
			<%@ include file="/WEB-INF/views/accessError.jsp"%>
	     </c:if>
         <c:if test = "${!sessionScope.userApp.logged}">
           <c:redirect url="/"/>
         </c:if>
       </body>
<tags:footer />