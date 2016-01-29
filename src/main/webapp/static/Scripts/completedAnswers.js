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
			handleErrors(result, "");
		}
	});
}

function appendSurveysToTable(surveysResults) {

	for (var i = 0; i < surveysResults.length; i++) {
		var currentSurvey = surveysResults[i].survey;
		var tableRow = '<tr><td>' + surveyResults[i].id + '</td><td>'
				+ currentSurvey.name
				+ '<td class="centeralign"><button onclick="openResults('
				+ surveyResults[i].id + ');">Open</button>&nbsp;'
				+ '</td></tr>';
		jQuery('#surveysResultsTable tr:last').after(tableRow);
	}
}

function openResults(id) {
	sessionStorage.setItem('surveyResult', id);
	goToPage("SurveyResult.html", false);
}