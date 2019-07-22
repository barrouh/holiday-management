<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header />
<body>
      <c:if test = "${sessionScope.userApp.logged}">
         <p>test<p>
      </c:if>
       <c:if test = "${!sessionScope.userApp.logged}">
         <jsp:include page="views/login.jsp"></jsp:include>
      </c:if>
</body>
<tags:footer />