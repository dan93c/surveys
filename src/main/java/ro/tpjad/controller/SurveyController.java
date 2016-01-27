package ro.tpjad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ro.tpjad.entity.Survey;
import ro.tpjad.entity.SurveyResult;
import ro.tpjad.service.SurveyResultService;
import ro.tpjad.service.SurveyService;

@Controller
public class SurveyController {

	@Autowired
	SurveyService surveyService;

	@Autowired
	SurveyResultService surveyResultService;

	@RequestMapping(value = "/addSurvey", method = RequestMethod.POST)
	public @ResponseBody String addSurvey(@RequestBody Survey survey) {
		surveyService.addSurvey(survey);
		
		return "{\"success\":1}";
	}

	@RequestMapping(value = "/addSurveyResult", method = RequestMethod.POST)
	public void addSurvey(@RequestBody SurveyResult surveyResult) {
		surveyResultService.addSurveyResult(surveyResult);
	}

	@RequestMapping(value = "/getAllSurveys", method = RequestMethod.GET)
	public @ResponseBody List<Survey> getAllSurveys() {
		return surveyService.getAllSurveys();
	}

	@RequestMapping(value = "/getAllSurveyResults", method = RequestMethod.GET)
	public @ResponseBody List<SurveyResult> getAllSurveyResults() {
		return surveyResultService.getAllSurveyResults();
	}

	@RequestMapping(value = "/findSurveyResult", method = RequestMethod.GET)
	public @ResponseBody SurveyResult findSurveyResult(@RequestParam String id) {
		return surveyResultService.findSurveyResult(Long.parseLong(id));
	}

	@RequestMapping(value = "/findSurvey", method = RequestMethod.GET)
	public @ResponseBody Survey findSurvey(@RequestParam String id) {
		return surveyService.findSurvey(Long.parseLong(id));
	}
	
	@RequestMapping(value = "/deleteSurvey", method = RequestMethod.POST)
	public @ResponseBody List<Survey> deleteSurvey(@RequestBody Survey survey) {
		surveyService.deleteSurvey(survey);
		
		return surveyService.getAllSurveys();
	}

}
