function addQuestion() {
	var numberOfApparitions = getNumberOfAparitions();
	var nextElement = numberOfApparitions + 1;

	var question = createQuestion(nextElement);
	jQuery('#addQuestionDivId').append(question);
}

function addSurvey() {
	var surveyJsonString = createSurveyJson();
	// var jsonSurvey = JSON.parse(surveyJsonString);
	console.log(surveyJsonString);
	$.ajax({
		type : "POST",
		url : "/Surveys/addSurvey",
		data : surveyJsonString,
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

function createSurveyJson() {
	var numberOfQuestions = getNumberOfAparitions();
	// add name and description to json
	var surveyJson = '{ "name" :"' + jQuery('#nameTextInput').val() + '",';
	surveyJson += '"description" :"' + jQuery('#descriptionTextInput').val()
			+ '",';
	surveyJson += '"createUser" : "' + jQuery('#userName').val() + '",';
	surveyJson += '"questions" : [';

	// iterate all the questions
	for (var i = 1; i <= numberOfQuestions; i++) {
		var type = jQuery('#TypeId' + i).val();
		surveyJson += '{"text" : "' + jQuery('#textQuestion' + i).val()
				+ '","type" : "' + type + '"';
		if (type != "FREE") {
			surveyJson += ',"possibleAnswers":"'
					+ jQuery('#textResponse' + i).val() + '"}';
		} else {
			surveyJson += ',"possibleAnswers":" "}';
		}
		if (numberOfQuestions != i) {
			surveyJson += ',';

		}
	}
	surveyJson += '] }'

	return surveyJson;
}