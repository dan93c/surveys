function addQuestion() {
	var nextElement = getNumberOfAparitions() + 1;

	var question = createQuestion(nextElement);
	jQuery('#addQuestionDivId').append(question);
}

function addSurvey() {
	var surveyJsonString = createSurveyJson();
	var jsonSurvey = JSON.parse(surveyJsonString);
	console.log(jsonSurvey);
	$.ajax({
		type : "POST",
		url : "/Surveys/addSurvey",
		data : jsonSurvey,
		accept : "application/json",
		success : function(data, textStatus, jqXHR) {
			goToPage("/Surveys", false);
			// data - response from server
		},
		error : function(response) {
			console.log("Error:", response);
		},
		dataType : "json",
		contentType : "application/json; charset=utf-8"
	});
}

function getNumberOfAparitions() {
	appears = 0;
	$('*[id*=textQuestion]:visible').each(function() {
		appears++;
	});

	return appears;
}

function createSurveyJson() {
	var numberOfQuestions = getNumberOfAparitions();
	// add name and description to json
	var surveyJson = '{ "survey" : { "name" :"'
			+ jQuery('#nameTextInput').val() + '",';
	surveyJson += '"description" :"' + jQuery('#descriptionTextInput').val()
			+ '",';
	surveyJson += '"questions" : [';

	// iterate all the questions
	for (var i = 1; i <= numberOfQuestions; i++) {
		if (numberOfQuestions == i) {
			surveyJson += '{"text" : "' + jQuery('#textQuestion' + i).val()
					+ '","type" : "' + jQuery('#TypeId' + i).val()
					+ '","possibleAnswers":"'
					+ jQuery('#textResponse' + i).val() + '"}';

		} else {
			surveyJson += '{"text" : "' + jQuery('#textQuestion' + i).val()
					+ '","type" : "' + jQuery('#TypeId' + i).val()
					+ '","possibleAnswers":"'
					+ jQuery('#textResponse' + i).val() + '"},';

		}
	}
	surveyJson += '] } }'
	console.log(surveyJson);

	return surveyJson;
}