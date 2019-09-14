<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include.jsp"%>

<tags:header />
<body>
      <c:if test = "${sessionScope.userApp.logged && sessionScope.userApp.hasSupervisorAccess}">
        <section class="uk-section uk-section-muted uk-animation-fade">
            <div class="uk-container uk-width-1-3 uk-section-default uk-box-shadow-xlarge uk-padding">
                <div>
                    <h3 class="uk-heading-line">
				<spring:message code="employee.form.details" />
			</h3>
            <hr>
                </div>
                <form method="POST" action="" class="">
                
                <div class="uk-margin">
                        <input class="uk-input" name="employeeId" type="hidden" value="${updatedEmployee.employeeId}">
                    </div>
                
                    <div class="uk-margin">
                        <input class="uk-input" name="firstname" type="text" placeholder="<spring:message code="employee.first.name" />" value="${updatedEmployee.firstName}">
                    </div>
                    <div class="uk-margin">
                        <input class="uk-input" name="lastname" type="text" placeholder="<spring:message code="employee.last.name"  />" value="${updatedEmployee.lastName}">
                    </div>
                    <div class="uk-margin">

                        <input class="uk-input" name="username" type="text" placeholder="<spring:message code="employee.user.name" />" value="${updatedEmployee.username}">
                    </div>
                    <div class="uk-margin">

                        <input class="uk-input" name="password" type="text" placeholder="<spring:message code="employee.user.name" />" value="${updatedEmployee.password}">
                    </div>
                    <div class="uk-margin">
                        <input class="uk-input" name="addressmail" type="text" placeholder="<spring:message code="employee.address.mail" />" value="${updatedEmployee.mailAdress}">
                    </div>
                    <div class="uk-margin">
                        <input class="uk-input" name="grade" type="text" placeholder="<spring:message code="employee.grade" />" value="${updatedEmployee.grade}">
                    </div>
                   <div class="uk-margin">
						<select class="uk-input" name="project">
							<c:if test="${not empty projects}">
								<c:forEach items="${projects}" var="project">
									<option value="${project.projectId}">${project.projectName}</option>
								</c:forEach>
							</c:if>
						</select>
					</div>
					<div class="uk-margin">
						<select class="uk-input" name="supervisor">
							<c:if test="${not empty supervisors}">
								<c:forEach items="${supervisors}" var="supervisor">
									<option  value="${supervisor.employeeId}">${supervisor.username}</option>
								</c:forEach>
							</c:if>
						</select>
					</div>
				<div>
                        <input class="uk-input" name="initialdays" type="text" placeholder="<spring:message code="employee.initial.days" />" value="${updatedEmployee.initialBalance}">
                    </div>
                    <div class="uk-margin">

                        <input class="uk-input" name="availabledays" type="text" placeholder="<spring:message code="employee.available.days" />" value="${updatedEmployee.currentBalance}">
                    </div>
                    <hr>
                    <div class="uk-align-right">
                        <button type="reset" class="uk-button uk-button-default" id="form-button-cancel-personal">
                            <spring:message code="button.cancel" />
                        </button>
                        <button type="submit" class="uk-button uk-button-primary" id="form-button-add-personal">
                            <spring:message code="employee.form.button.edit.employee" />
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