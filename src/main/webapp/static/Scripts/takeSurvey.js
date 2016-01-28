$(document).ready(function() {

	getSurveyQuestions();

});

function getSurveyQuestions() {
	surveyId = sessionStorage.getItem('surveyId');
	console.log("SurveyId : ", surveyId);

	jQuery.ajax({
		type : "GET",
		url : "/Surveys/findSurvey",
		data : {
			id : surveyId
		},
		accept : "application/json",
		success : function(response) {
			console.log(response.data);
			appendQuestionsToSurvey(response.data);
		},
		error : function(response) {
			handleErrors(result, "");
		}
	});
}

function appendQuestionsToSurvey(survey) {
	console.log("append");
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
		questionDiv += '<textarea class="form-control" id="textareaResponse"'
				+ question.id
				+ ' name="textareaResponse" placeholder="Insert your text here"></textarea>';
		questionDiv += '</div>';
		questionDiv += '</div>';
	} else if (question.type === "SELECT_ONE") {
		questionDiv += '<div class="form-group">';
		questionDiv += '<label class="col-md-4 control-label" for="radiosResponse'
				+ question.id + '">Response</label>';
		questionDiv += '<div class="col-md-4">';
		for (var i = 0; i < question.possibleAnswersList.length; i++) {
			questionDiv += '<div class="radio">';
			questionDiv += '<label for="radiosResponse-'
					+ i
					+ '"> <input type="radio" name="radiosResponse" id="radiosResponse-'
					+ i + '" value="' + question.possibleAnswersList[i]
					+ '" checked="checked">' + question.possibleAnswersList[i]
					+ '</label>';
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
			questionDiv += '<label for="checkboxesResponse-'
					+ i
					+ '"> <input type="checkbox" name="checkboxesResponse" id="checkboxesResponse-'
					+ i + '" value="' + question.possibleAnswersList[i] + '">'
					+ question.possibleAnswersList[i] + '</label>';
			questionDiv += '</div>';
		}
		questionDiv += '</div>';
		questionDiv += '</div>';
	}
	console.log(questionDiv);
	return questionDiv;
}