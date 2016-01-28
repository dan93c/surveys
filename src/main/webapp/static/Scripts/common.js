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
	question += '<label class="col-md-4 control-label" for="textQuestion'
			+ number + '">Question' + number + '</label>';
	question += '<div class="col-md-6">';
	question += '<input id="textQuestion'
			+ number
			+ '" name="textQuestion'
			+ number
			+ '" type="text" placeholder="" class="form-control input-md" required="">';
	question += '</div>';
	question += '</div>';
	question += '<div class="form-group">';
	question += '<label class="col-md-4 control-label" for="textType">Type</label>';
	question += '<div class="col-md-6">';
	question += '<select id="TypeId' + number + '" name="TypeName' + number
			+ '" class="form-control input-md" onchange="changeType(this);">';
	question += '<option value="FREE_TEXT">Free text</option>';
	question += '<option value="SELECT_ONE">Select answer</option>';
	question += '<option value="SELECT_MULTIPLE">Multiple choice</option>';
	question += '</select>';
	question += '</div>';
	question += '</div>';
	question += '</div>';

	return question;

}

function changeType(element) {
	var type = element.value;
	var responseDiv = "";
	var number = getNumberOfAparitions();
	if (type != "FREE_TEXT") {
		if (document.getElementById("responseDiv" + number) == null) {
			responseDiv += '<div id="responseDiv' + number
					+ '" class="form-group">';
			responseDiv += '<label class="col-md-4 control-label" for="textResponse'
					+ number + '">Answer</label>';
			responseDiv += '<div class="col-md-6">';
			responseDiv += '<input id="textResponse'
					+ number
					+ '" name="textResponse'
					+ number
					+ '" type="text" placeholder="" class="form-control input-md" required="">';
			responseDiv += '</div>';
			responseDiv += '</div>';
		}

	} else {
		var divId = 'responseDiv' + number;
		console.log(divId);
		if (document.getElementById(divId) != null) {
			jQuery('#' + divId).remove();
		}
	}

	if (responseDiv != "") {
		jQuery('#addQuestionDivId').append(responseDiv);
	}
}

function getNumberOfAparitions() {
	appears = 0;
	$('*[id*=textQuestion]:visible').each(function() {
		appears++;
	});

	return appears;
}

function handleErrors(result, redirectPage) {
	if (result.success === false) {
		sweetAlert('Error!', result.errorMessage, 'error');
	} else {
		swal({
			title : "Success!",
			text : result.errorMessage,
			type : "success",
			showCancelButton : false,
			confirmButtonText : "OK",
			closeOnConfirm : true
		}, function() {
			goToPage(redirectPage, false);
		});

	}
}