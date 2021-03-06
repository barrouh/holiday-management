    <%@ include file="/WEB-INF/views/include.jsp"%>
  
        <c:set var="employee" value="${sessionScope.userApp.employee}" />

        <div class="account">
            <p class="uk-heading-line title">
                <span>Account Informations</span>
            </p>

            <div class="uk-margin">
                <p>
                    Employee ID:
                    <c:out value="${employee.employeeId}" />
                </p>
            </div>

            <div class="uk-margin">
                <p>
                    First Name:
                    <c:out value="${employee.firstName}" />
                </p>
            </div>

            <div class="uk-margin">
                <p>
                    Last Name:
                    <c:out value="${employee.lastName}" />
                </p>
            </div>

            <div class="uk-margin">
                <p>
                    Email :
                    <c:out value="${employee.mailAdress}" />
                </p>
            </div>

            <div class="uk-margin">
                <p>
                    Grade :
                    <c:out value="${employee.grade}" />
                </p>
            </div>

            <div class="uk-margin">
                <p>
                    Project :
                    <c:out value="${employee.project.projectName}" />
                </p>
            </div>

            <div class="uk-margin">
                <p>
                    Supervisor :
                    <c:out value="${employee.supervisor.username}" />
                </p>
            </div>

            <div class="uk-margin">
                <p>
                    Initial Balance :
                    <c:out value="${employee.initialBalance}" />
                </p>
            </div>

            <div class="uk-margin">
                <p>
                    Current Balance :
                    <c:out value="${employee.currentBalance}" />
                </p>
            </div>

            <p class="uk-heading-line title">
                <span>Account Settings</span>
            </p>

            <form method="POST" action="/saveSettings" class="">

                <div class="uk-margin">
                    Email Notification
                     <c:if test = "${employee.notifications}">
                         <input type="checkbox" name="notifications" checked/>
                     </c:if>
			         <c:if test = "${!employee.notifications}">
			             <input type="checkbox" name="notifications" />
			         </c:if>
                </div>

                <div class="uk-margin">
                    <button type="submit" class="uk-button uk-button-primary uk-width-1-3 uk-align-center" id="login-button-personal" data-loading-text="<i class='fa fa-cog fa-spin'></i>">
                        Save
                    </button>
                </div>

            </form>
        </div>