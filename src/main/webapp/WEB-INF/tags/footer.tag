<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<spring:url value="/resources/scripts/jquery/jquery.min.js"
	var="jqueryJs" />
<spring:url value="/resources/scripts/uikit/uikit-icons.min.js"
	var="uikitIcones" />
<spring:url value="/resources/scripts/uikit/uikit.min.js" var="uikitJs" />
<spring:url value="/resources/scripts/angular/angular.min.js"
	var="angularJs" />
<spring:url value="/resources/scripts/main.js" var="mainJs" />
<script src="${jqueryJs}"></script>
<script src="${uikitIcones}"></script>
<script src="${uikitJs}"></script>
<script src="${angularJs}"></script>
<script src="${mainJs}"></script>

<div class="uk-section uk-section-xsmall">
	<div class="uk-container uk-container-large">
		<h6 class="uk-text-center">
			<span> <spring:message code="footer.markup" /></span>
		</h6>
	</div>
</div>
</html>



