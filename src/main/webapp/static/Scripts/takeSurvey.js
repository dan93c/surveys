$(document).ready(function() {

	getSurveyQuestions();

});

function sendSurveyResult(jsonDataObject) {
	$.ajax({
		type : "POST",
		url : "/Surveys/addSurveyResult",
		data : JSON.stringify(jsonDataObject),
		accept : "application/json",
		dataType : "json",
		contentType : "application/json; charset=utf-8",
		success : function(result) {
			handleErrors(result, "/Surveys");
		},
		error : function(error) {
			handleErrors(error, "");
		}
	});
}

function submitSurvey() {
	var jsonDataObject = createSurveyResultsData();
	console.log("Result ", jsonDataObject);

	sendSurveyResult(jsonDataObject);
}

function createSurveyResultsData() {
	var surveyResult = {};
	var completedAnswers = [];

	var surveyStorage = JSON.parse(sessionStorage.getItem('survey'));
	var questions = surveyStorage.questions;
	for (var i = 0; i < questions.length; i++) {
		var completedAnswer = {};
		var question = questions[i];
		completedAnswer.question = question;

		var text = "";
		if (question.type === "SELECT_ONE") {
			text += jQuery(
					'input[name="radiosResponse' + question.id + '"]:checked')
					.val();
		} else if (question.type === "SELECT_MULTIPLE") {
			$('input[name="checkboxesResponse' + question.id + '"]:checked')
					.each(function() {
						text += $(this).val() + ';';
					});
			text = text.substring(0, text.length - 1);
		} else if (question.type == "FREE_TEXT") {
			text = jQuery('#textareaResponse' + question.id).val();
		}

		completedAnswer.text = text;
		completedAnswers.push(completedAnswer);
	}

	surveyResult.survey = surveyStorage;
	surveyResult.completedAnswers = completedAnswers;

	return surveyResult;

}

function getSurveyQuestions() {
	surveyId = sessionStorage.getItem('surveyId');

	jQuery.ajax({
		type : "GET",
		url : "/Surveys/findSurvey",
		data : {
			id : surveyId
		},
		accept : "application/json",
		success : function(response) {
			sessionStorage.setItem('survey', JSON.stringify(response.data));
			appendQuestionsToSurvey(response.data);
		},
		error : function(response) {
			handleErrors(result, "");
		}
	});
}

function appendQuestionsToSurvey(survey) {
	for (var i = 0; i < survey.questions.length; i++) {
		var currentQuestion = survey.questions[i];
		var question = createQuestionDiv(currentQuestion);
		jQuery('#takeQuestionDivId').append(question);
	}
}

function createQuestionDiv(question) {
	var questionDiv = '<div class="form-group">';
	questionDiv += '<label class="col-md-6 control-label" for="textQuestion'
			+ question.id + '">' + question.text + '</label>';
	questionDiv += '</div>';

	if (question.type === "FREE_TEXT") {
		questionDiv += '<div class="form-group">';
		questionDiv += '<label class="col-md-4 control-label" for="textareaResponse'
				+ question.id + '">Response</label>';
		questionDiv += '<div class="col-md-4">';
		questionDiv += '<textarea class="form-control" id="textareaResponse'
				+ question.id
				+ '" name="textareaResponse" placeholder="Insert your text here"></textarea>';
		questionDiv += '</div>';
		questionDiv += '</div>';
	} else if (question.type === "SELECT_ONE") {
		questionDiv += '<div class="form-group">';
		questionDiv += '<label class="col-md-4 control-label" for="radiosResponse'
				+ question.id + '">Response</label>';
		questionDiv += '<div class="col-md-4">';
		for (var i = 0; i < question.possibleAnswersList.length; i++) {
			questionDiv += '<div class="radio">';
			questionDiv += '<label for="radiosResponse-' + i
					+ '"> <input type="radio" name="radiosResponse'
					+ question.id + '" id="radiosResponse-' + i + '" value="'
					+ question.possibleAnswersList[i] + '">'
					+ question.possibleAnswersList[i] + '</label>';
			questionDiv += '</div>';
		}
		questionDiv += '</div>';
		questionDiv += '</div>';
	} else if (question.type === "SELECT_MULTIPLE") {
		questionDiv += '<div class="form-group">';
		questionDiv += '<label class="col-md-4 control-label" for="checkboxesResponse'
				+ question.id + '">Response</label>';
		questionDiv += '<div class="col-md-4">';
		for (var i = 0; i < question.possibleAnswersList.length; i++) {
			questionDiv += '<div class="checkbox">';
			questionDiv += '<label for="checkboxesResponse-' + i
					+ '"> <input type="checkbox" name="checkboxesResponse'
					+ question.id + '" id="checkboxesResponse-' + i
					+ '" value="' + question.possibleAnswersList[i] + '">'
					+ question.possibleAnswersList[i] + '</label>';
			questionDiv += '</div>';
		}
		questionDiv += '</div>';
		questionDiv += '</div>';
	}

	return questionDiv;
}