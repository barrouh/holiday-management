<%-- list of all projects--%>

<%@ include file="/WEB-INF/views/include.jsp"%>

<tags:navbar />
<div
	class="uk-section uk-section-xsmall uk-section-muted uk-animation-fade">
	<div
		class="uk-container uk-container-large uk-width-5-6 uk-section-default uk-box-shadow-medium uk-padding">
		<div>
			<a href="#" class="uk-icon-link uk-margin-small-right uk-align-right"
				uk-icon="icon: plus-circle; ratio: 2" uk-tooltip="Add a new project"></a>
			<h2 class="uk-heading-line">
				<spring:message code="Projects.header" />
			</h2>
			<hr>
		</div>
		<div class="uk-overflow-auto">
			<table
				class="uk-table uk-table-hover uk-table-small uk-table-divider">
				<thead id="table-th-personal">
					<tr>
						<th><spring:message code="project.name" /></th>
						<th><spring:message code="project.description" /></th>
						<th><spring:message code="actions" /></th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td class="uk-text-truncate">-</td>
						<td class="uk-text-truncate">-</td>
						<td class="uk-text-truncate"><a href="#"
							class="uk-icon-link uk-margin-small-right" uk-icon="file-edit"
							uk-tooltip="Edit"></a> <a href="#" class="uk-icon-link"
							uk-icon="trash" uk-tooltip="Delete"></a></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
