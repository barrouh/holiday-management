<%-- edit project--%>

<%@ include file="/WEB-INF/views/include.jsp"%>
<tags:navbar />
<section class="uk-section uk-section-muted uk-animation-fade">
	<div
		class="uk-container uk-width-1-3 uk-section-default uk-box-shadow-xlarge uk-padding">
		<div>
			<h3 class="uk-heading-line">
				<spring:message code="project.details" />
			</h3>
			<hr>
		</div>
		<form method="POST" action="" class="">
			<div class="uk-margin">
				<input class="uk-input" name="projectname" type="text"
					placeholder="<spring:message code="project.name" />">
			</div>
			<div class="uk-margin">
				<input class="uk-input" name="projectdescription" type="text"
					placeholder="<spring:message code="project.description" />">
			</div>
			<hr>
			<div class="uk-align-right">
				<button type="button" class="uk-button uk-button-default"
					id="form-button-cancel-personal">
					<spring:message code="button.cancel" />
				</button>
				<button type="submit" class="uk-button uk-button-primary"
					id="form-button-add-personal">
					<spring:message code="project.form.button.edit.project" />
				</button>
			</div>
		</form>
	</div>
</section>