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
				+ currentSurvey.name + '<td class="centeralign"><a href="#">Open</a><a href="#">Delete</a></td></tr>';
		jQuery('#surveysTable tr:last').after(tableRow);
	}
}