$(document).ready(function() {

	getSurveysResults();

});

function getSurveysResults() {
	jQuery.ajax({
		type : "GET",
		url : "/Surveys/getAllSurveyResults",
		accept : "application/json",
		success : function(response) {
			appendSurveysToTable(response.data);
		},
		error : function(response) {
			handleErrors(response, "");
		}
	});
}

function appendSurveysToTable(surveysResults) {

	for (var i = 0; i < surveysResults.length; i++) {
		var currentSurvey = surveysResults[i].survey;
		var tableRow = '<tr><td>' + surveysResults[i].id + '</td><td>'
				+ currentSurvey.name
				+ '<td class="centeralign"><button onclick="openResults('
				+ surveysResults[i].id + ');">Open</button>&nbsp;'
				+ '</td></tr>';
		jQuery('#surveysResultsTable tr:last').after(tableRow);
	}
}

function openResults(id) {
	sessionStorage.setItem('surveyResult', id);
	goToPage("SurveyResult.html", false);
}