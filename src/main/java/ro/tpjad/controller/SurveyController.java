package ro.tpjad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ro.tpjad.service.SurveyService;

@Controller
public class SurveyController {

	@Autowired
	SurveyService surveyService;

	@RequestMapping(value = "/getAll")
	public String getAllQuestions(Model model) {
		return "/static/html/main.html";

	}
}
