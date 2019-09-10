<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include.jsp"%>
<tags:header />
<body>
<c:if test = "${sessionScope.userApp.logged}">
<%-- add new employee--%>
        <section class="uk-section uk-section-muted uk-animation-fade">
            <div class="uk-container uk-width-1-3 uk-section-default uk-box-shadow-xlarge uk-padding">
                <div>
                    <h3 class="uk-heading-line">
				<spring:message code="holiday.form.details" />
			</h3>
            <hr>
                </div>
                <form method="POST" action="/requestHoliday" class="">
                    <div class="uk-margin">
                        <input class="uk-input" name="startDate" type="date" placeholder="<spring:message code="holiday.start.date" />">
                    </div>
                    <div class="uk-margin">
                        <input class="uk-input" name="endDate" type="date" placeholder="<spring:message code="holiday.end.date" />">
                    </div>
                    <div class="uk-margin">
                        <input class="uk-input" name="duration" type="number" placeholder="<spring:message code="holiday.duration" />">
                    </div>
                    <hr>
                    <div class="uk-align-right">
                        <button type="reset" class="uk-button uk-button-default" id="form-button-cancel-personal">
                            <spring:message code="button.cancel" />
                        </button>
                        <button type="submit" class="uk-button uk-button-primary" id="form-button-add-personal">
                            <spring:message code="holiday.form.button.add.holiday" />
                        </button>
                    </div>
                </form>
            </div>
        </section>
         </c:if>
         <c:if test = "${!sessionScope.userApp.logged}">
           <c:redirect url="/"/>
         </c:if>
       </body>
<tags:footer />