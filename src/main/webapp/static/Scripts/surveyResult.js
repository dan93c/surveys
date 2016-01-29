$(document).ready(function() {

	getSurveyResult();

});

function getSurveyResult() {
	surveyResultId = sessionStorage.getItem('surveyResult');

	jQuery.ajax({
		type : "GET",
		url : "/Surveys/findSurveyResult",
		data : {
			id : surveyResultId
		},
		accept : "application/json",
		success : function(response) {
			console.log(response.data);
			appendSurveyResult(response.data);
		},
		error : function(response) {
			handleErrors(result, "");
		}
	});
}

function appendSurveyResult(surveyResult) {
	for (var i = 0; i < surveyResult.completedAnswers.length; i++) {
		var currentSurveyResult = surveyResult.completedAnswers[i];
		var question = createQuestionDiv(currentSurveyResult);
		jQuery('#surveyResultsQuestionDivId').append(question);
	}
}

function createQuestionDiv(completedAnswer) {
	var questionDiv = '<div class="form-group">';
	questionDiv += '<label class="col-md-6 control-label" for="textQuestion'
			+ completedAnswer.question.id + '">'
			+ completedAnswer.question.text + '</label>';
	questionDiv += '</div>';

	if (completedAnswer.question.type === "FREE_TEXT") {
		questionDiv += '<div class="form-group">';
		questionDiv += '<label class="col-md-4 control-label" for="textareaResponse'
				+ completedAnswer.question.id + '">Response</label>';
		questionDiv += '<div class="col-md-4">';
		questionDiv += '<textarea class="form-control" id="textareaResponse'
				+ completedAnswer.question.id + '" name="textareaResponse">'
				+ completedAnswer.text + '</textarea>';
		questionDiv += '</div>';
		questionDiv += '</div>';
	} else if (completedAnswer.question.type === "SELECT_ONE") {
		questionDiv += '<div class="form-group">';
		questionDiv += '<label class="col-md-4 control-label" for="radiosResponse'
				+ completedAnswer.question.id + '">Response</label>';
		questionDiv += '<div class="col-md-4">';
		for (var i = 0; i < completedAnswer.question.possibleAnswersList.length; i++) {
			questionDiv += '<div class="radio">';
			if (completedAnswer.question.possibleAnswersList[i] == completedAnswer.text) {
				questionDiv += '<label for="radiosResponse-' + i
						+ '"> <input type="radio" name="radiosResponse'
						+ completedAnswer.question.id + '" id="radiosResponse-'
						+ i + '" value="'
						+ completedAnswer.question.possibleAnswersList[i]
						+ '" checked="checked">'
						+ completedAnswer.question.possibleAnswersList[i]
						+ '</label>';
			} else {
				questionDiv += '<label for="radiosResponse-' + i
						+ '"> <input type="radio" name="radiosResponse'
						+ completedAnswer.question.id + '" id="radiosResponse-'
						+ i + '" value="'
						+ completedAnswer.question.possibleAnswersList[i] + '>'
						+ completedAnswer.question.possibleAnswersList[i]
						+ '</label>';
			}

			questionDiv += '</div>';
		}
		questionDiv += '</div>';
		questionDiv += '</div>';
	} else if (completedAnswer.question.type === "SELECT_MULTIPLE") {
		questionDiv += '<div class="form-group">';
		questionDiv += '<label class="col-md-4 control-label" for="checkboxesResponse'
				+ completedAnswer.question.id + '">Response</label>';
		questionDiv += '<div class="col-md-4">';
		for (var i = 0; i < completedAnswer.possibleAnswersList.length; i++) {
			questionDiv += '<div class="checkbox">';
			if (completedAnswer.question.possibleAnswersList[i] == completedAnswer.text) {
				questionDiv += '<label for="checkboxesResponse-' + i
						+ '"> <input type="checkbox" name="checkboxesResponse'
						+ completedAnswer.question.id
						+ '" id="checkboxesResponse-' + i + '" value="'
						+ completedAnswer.question.possibleAnswersList[i]
						+ '" checked>'
						+ completedAnswer.question.possibleAnswersList[i]
						+ '</label>';
			} else {
				questionDiv += '<label for="checkboxesResponse-' + i
						+ '"> <input type="checkbox" name="checkboxesResponse'
						+ completedAnswer.question.id
						+ '" id="checkboxesResponse-' + i + '" value="'
						+ completedAnswer.question.possibleAnswersList[i]
						+ '">'
						+ completedAnswer.question.possibleAnswersList[i]
						+ '</label>';
			}
			questionDiv += '</div>';
		}
		questionDiv += '</div>';
		questionDiv += '</div>';
	}

	return questionDiv;
}