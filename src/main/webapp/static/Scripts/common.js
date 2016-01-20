function goToPage(page, fromFirstPage) {
	console.log("Entered goToPage with:" + page);
	if (fromFirstPage == true) {
		window.location = "static/html/" + page;
	} else {
		window.location = page;
	}
}

function createQuestion(number) {
	var question = '<div class="form-group">';
	question += '<label class="col-md-4 control-label" for="textQuestion'+ number + '">Question' + number + '</label>';
	question += '<div class="col-md-6">';
	question += '<input id="textQuestion'+ number + '" name="textQuestion'+ number + '" type="text" placeholder="" class="form-control input-md" required="">';
	question += '</div>';
	question += '</div>';
	question += '<div class="form-group">';
	question += '<label class="col-md-4 control-label" for="textType">Type</label>';
	question += '<div class="col-md-6">';
	question += '<select id="TypeId'+ number + '" name="TypeName'+ number + '" class="form-control input-md" onchange="changeType();">';
	question += '<option value="FREE_TEXT">Free text</option>';
	question += '<option value="SELECT_ONE">Select answer</option>';
	question += '<option value="SELECT_MULTIPLE">Multiple choice</option>';
	question += '</select>';
	question += '</div>';
	question += '</div>';
	question += '<div class="form-group">';
	question += '<label class="col-md-4 control-label" for="textResponse'+ number + '">Response</label>';
	question += '<div class="col-md-6">';
	question += '<input id="textResponse'+ number + '" name="textResponse'+ number + '" type="text" placeholder="" class="form-control input-md" required="">';
	question += '</div>';
	question += '</div>';
	question += '</div>';
	
	return question;
		
}