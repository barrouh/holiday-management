    <%@ include file="/WEB-INF/views/include.jsp"%>
  
    <c:set var="employee" value="${sessionScope.userApp.employee}" />
      
        <div uk-alert>
		    <h2>Notice</h2>
		    <p>Dear <c:out value="${employee.firstName}" /> <c:out value="${employee.lastName}" />, we are sorry it seems that you dont have access to this page</p>
		    <br/>
		</div>