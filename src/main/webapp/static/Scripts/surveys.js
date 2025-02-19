$(document).ready(function() {

	getSurveys();

});

function getSurveys() {
	jQuery.ajax({
		type : "GET",
		url : "/Surveys/getAllSurveys",
		accept : "application/json",
		success : function(response) {
			appendSurveysToTable(response.data);
		},
		error : function(response) {
			handleErrors(result, "");
		}
	});
}

function appendSurveysToTable(surveys) {

	for (var i = 0; i < surveys.length; i++) {
		var currentSurvey = surveys[i];
		var tableRow = '<tr><td>' + currentSurvey.id + '</td><td>'
				+ currentSurvey.name
				+ '<td class="centeralign"><button onclick="deleteSurvey('
				+ currentSurvey.id + ');">Delete</button>'
				+ '&nbsp;<button onclick="takeSurvey(' + currentSurvey.id
				+ ');">Start</button></td></tr>';
		jQuery('#surveysTable tr:last').after(tableRow);
	}
}

function openSurvey(id) {
	sessionStorage.setItem('surveyId', id);
	goToPage("main.html", false);
}

function deleteSurvey(id) {
	$.post("/Surveys/deleteSurvey", {
		"id" : id
	}, function(result) {
		handleErrors(result, "Surveys.html");
	});
}

function takeSurvey(id) {
	sessionStorage.setItem('surveyId', id);
	goToPage("TakeSurvey.html", false);
}
