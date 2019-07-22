<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<section class="uk-section uk-section-muted uk-animation-fade ">
	<div class="uk-container uk-container-small uk-box-shadow-xlarge uk-padding">
		<h5 class="uk-heading-line uk-text-center" id="login-form-text-personal">Log In</h5>
		<form method="POST" action="/login" class="">
			<div class="uk-margin ">
				<input class="uk-input uk-width-1-3 uk-align-center" id="login-user-personal" name="username" type="text"  placeholder="Username">
			</div>
			<div class="uk-margin ">
				<input class="uk-input uk-width-1-3 uk-align-center" name="password" type="password" placeholder="Password">
			</div>
			<div class="uk-margin">
				<button type="submit" class="uk-button uk-button-primary uk-width-1-3 uk-align-center" id="login-button-personal" data-loading-text="<i class='fa fa-cog fa-spin'></i>">login</button>
			</div>
			<div class="uk-margin">
				<p>
				
				</p>
			</div>
		</form>
	</div>
</section>