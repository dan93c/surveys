$(document).ready(function() {

	getSurveys();

});

function getSurveys() {
	jQuery.ajax({
		type : "GET",
		url : "/Surveys/getAllSurveys",
		accept : "application/json",
		success : function(response) {
			appendSurveysToTable(response);
		},
		error : function(response) {
			console.log("Error:" + response);
		}
	});
}

function appendSurveysToTable(surveys) {

	for (var i = 0; i < surveys.length; i++) {
		var currentSurvey = surveys[i];
		var tableRow = '<tr><td>' + currentSurvey.id + '</td><td>'
				+ currentSurvey.name
				+ '<td class="centeralign"><button onclick="openSurvey('
				+ currentSurvey.id
				+ ');">Open</button></td></tr>';
		jQuery('#surveysTable tr:last').after(tableRow);
	}
}

function openSurvey(id) {
	sessionStorage.setItem('surveyId',id);
	goToPage("main.html", false);
}
