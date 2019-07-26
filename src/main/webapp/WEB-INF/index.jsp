<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include.jsp"%>

<tags:header />
<body>
      <c:if test = "${sessionScope.userApp.logged}">
         <jsp:include page="views/login.jsp"></jsp:include>
      </c:if>
       <c:if test = "${!sessionScope.userApp.logged}">
         <jsp:include page="views/login.jsp"></jsp:include>
      </c:if>
</body>
<tags:footer />