<%-- add new employee--%>

<%@ include file="/WEB-INF/views/include.jsp"%>
<tags:navbar />
<section class="uk-section uk-section-muted uk-animation-fade">
	<div
		class="uk-container uk-width-1-3 uk-section-default uk-box-shadow-xlarge uk-padding">
		<div>
			<h3 class="uk-heading-line">
				<spring:message code="employee.form.details" />
			</h3>
			<hr>
		</div>
		<form method="POST" action="" class="">
			<div class="uk-margin">
				<input class="uk-input" name="firstname" type="text"
					placeholder="<spring:message code="employee.first.name" />">
			</div>
			<div class="uk-margin">
				<input class="uk-input" name="lastname" type="text"
					placeholder="<spring:message code="employee.last.name" />">
			</div>
			<div class="uk-margin">
				<input class="uk-input" name="username" type="text"
					placeholder="<spring:message code="employee.user.name" />">
			</div>
			<div class="uk-margin">
				<input class="uk-input" name="addressmail" type="text"
					placeholder="<spring:message code="employee.address.mail" />">
			</div>
			<div class="uk-margin">
				<input class="uk-input" name="grade" type="text"
					placeholder="<spring:message code="employee.grade" />">
			</div>
			<div class="uk-margin">
				<input class="uk-input" name="project" type="text"
					placeholder="<spring:message code="employee.project" />">
			</div>
			<div class="uk-margin">
				<input class="uk-input" name="supervisor" type="text"
					placeholder="<spring:message code="employee.supervisor" />">
			</div>
			<div class="uk-margin">
				<input class="uk-input" name="initialdays" type="text"
					placeholder="<spring:message code="employee.initial.days" />">
			</div>
			<div class="uk-margin">
				<input class="uk-input" name="availabledays" type="text"
					placeholder="<spring:message code="employee.available.days" />">
			</div>
			<hr>
			<div class="uk-align-right">
				<button type="buttons" class="uk-button uk-button-default"
					id="form-button-cancel-personal">
					<spring:message code="button.cancel" />
				</button>
				<button type="submit" class="uk-button uk-button-primary"
					id="form-button-add-personal">
					<spring:message code="employee.form.button.add.employee" />
				</button>
			</div>
		</form>
	</div>
</section>