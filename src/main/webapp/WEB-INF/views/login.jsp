<%-- UserName/Password login form--%>

<%@ include file="/WEB-INF/views/include.jsp"%>

<section class="uk-section uk-section-muted uk-animation-fade ">
	<div
		class="uk-container uk-container-small uk-section-default uk-box-shadow-xlarge uk-padding">
		<h5 class="uk-heading-line uk-text-center"
			id="login-form-text-personal">
			<spring:message code="login.header" />
		</h5>
		<form method="POST" action="/login" class="">
			<div class="uk-margin ">
				<input class="uk-input uk-width-1-3 uk-align-center"
					id="login-user-personal" name="username" type="text"
					placeholder="User name">
			</div>
			<div class="uk-margin ">
				<input class="uk-input uk-width-1-3 uk-align-center" name="password"
					type="password" placeholder="Password">
			</div>
			<div class="uk-margin">
				<button type="submit"
					class="uk-button uk-button-primary uk-width-1-3 uk-align-center"
					id="login-button-personal"
					data-loading-text="<i class='fa fa-cog fa-spin'></i>">
					<spring:message code="login.button" />
				</button>
			</div>
		</form>
	</div>
</section>