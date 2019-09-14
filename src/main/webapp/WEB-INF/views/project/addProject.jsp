<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include.jsp"%>

<tags:header />
<body>
<c:if test = "${sessionScope.userApp.logged && sessionScope.userApp.hasSupervisorAccess}">
<%-- add new project--%>
        <section class="uk-section uk-section-muted uk-animation-fade">
            <div class="uk-container uk-width-1-3 uk-section-default uk-box-shadow-xlarge uk-padding">
                <div>
                    <h3 class="uk-heading-line">
				<spring:message code="project.details" />
			</h3>
            <hr>
                </div>
                <form method="POST" action="/addProject" class="">
                    <div class="uk-margin">
                        <input class="uk-input" name="projectId" type="text" placeholder="<spring:message code="project.id" />">
                    </div>
                    <div class="uk-margin">
                        <input class="uk-input" name="projectName" type="text" placeholder="<spring:message code="project.name" />">
                    </div>
                    <div class="uk-margin">
                        <input class="uk-input" name="projectDescription" type="text" placeholder="<spring:message code="project.description" />">
                    </div>
                    <hr>
                    <div class="uk-align-right">
                        <button type="reset" class="uk-button uk-button-default" id="form-button-cancel-personal">
                            <spring:message code="button.cancel" />
                        </button>
                        <button type="submit" class="uk-button uk-button-primary" id="form-button-add-personal">
                            <spring:message code="project.form.button.add.project" />
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