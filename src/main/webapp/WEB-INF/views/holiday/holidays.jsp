<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include.jsp"%>
<jsp:useBean id="tools" class="com.everis.web.Tools"/>

<tags:header />
<body>
      <c:if test = "${sessionScope.userApp.logged}">
        <div class="uk-section uk-section-xsmall uk-section-muted uk-animation-fade">
            <div class="uk-container uk-container-large uk-width-5-6 uk-section-default uk-box-shadow-medium uk-padding">
                <div>
                    <a href="/requestHoliday" class="uk-icon-link uk-margin-small-right uk-align-right" uk-icon="icon: plus-circle; ratio: 2" uk-tooltip="Request a new Holiday"></a>
                    <h2 class="uk-heading-line">
				<spring:message code="holidays.header" />
			</h2>
            <hr>
                </div>
                    <div class="uk-overflow-auto">
                        <table class="uk-table uk-table-hover uk-table-small uk-table-divider">
                            <thead id="table-th-personal">
                                <tr>
                                    <th>
                                        <spring:message code="holiday.reference" />
                                    </th>
                                    <th>
                                        <spring:message code="holiday.request.date" />
                                    </th>
                                    <th>
                                        <spring:message code="holiday.start.date" />
                                    </th>
                                    <th>
                                        <spring:message code="holiday.end.date" />
                                    </th>
                                    <th>
                                        <spring:message code="holiday.duration" />
                                    </th>
                                    <th>
                                        <spring:message code="holiday.status" />
                                    </th>
                                    <th>
                                        <spring:message code="holiday.comment" />
                                    </th>
                                    <th>
                                        <spring:message code="holiday.employee" />
                                    </th>
                                    <th>
                                        <spring:message code="actions" />
                                    </th>
                                </tr>
                            </thead>
                            <c:if test="${not empty holidays}">
                                <c:forEach items="${holidays}" var="holiday">
                                    <tbody style="border: 1px solide black;">
                                        <tr>
                                            <td class="uk-text-nowrap">${holiday.refHoliday}</td>
                                            <td class="uk-text-truncate">${tools.dateFormater(holiday.dateRequest)}</td>
                                            <td class="uk-text-truncate">${tools.dateFormater(holiday.startDate)}</td>
                                            <td class="uk-text-truncate">${tools.dateFormater(holiday.endDate)}</td>
                                            <td class="uk-text-truncate">${holiday.duration}</td>
                                            <td class="uk-text-truncate">${holiday.status}</td>
                                            <td class="uk-text-truncate">${holiday.comment}</td>
                                            <td class="uk-text-truncate">${holiday.employee.username}</td>
                                            <td class="uk-text-nowrap">
                                                <a href="/holidayActions?approve=${holiday.refHoliday}" class="uk-icon-link uk-margin-small-right" uk-icon="file-edit" uk-tooltip="Edit">Approve</a>
                                                <a href="/holidayActions?reject=${holiday.refHoliday}" class="uk-icon-link" uk-icon="trash" uk-tooltip="Delete">Reject</a>
                                            </td>
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