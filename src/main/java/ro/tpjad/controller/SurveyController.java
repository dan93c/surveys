package ro.tpjad.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ro.tpjad.entity.JsonEntityResponse;
import ro.tpjad.entity.Survey;
import ro.tpjad.entity.SurveyException;
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
	public @ResponseBody JsonEntityResponse addSurvey(@RequestBody Survey survey) {
		JsonEntityResponse response = null;
		try {
			survey.setCreateTime(new Date());
			surveyService.addSurvey(survey);
			response = new JsonEntityResponse(true);
		} catch (SurveyException ex) {
			response = new JsonEntityResponse(false, ex.getMessage());
		} catch (Exception ex) {
			response = new JsonEntityResponse(false, "Internal server error!");
		}
		return response;
	}

	@RequestMapping(value = "/addSurveyResult", method = RequestMethod.POST)
	public @ResponseBody JsonEntityResponse addSurvey(@RequestBody SurveyResult surveyResult) {
		JsonEntityResponse response = null;
		try {
			surveyResultService.addSurveyResult(surveyResult);
			response = new JsonEntityResponse(true);
		} catch (SurveyException ex) {
			response = new JsonEntityResponse(false, ex.getMessage());
		} catch (Exception ex) {
			response = new JsonEntityResponse(false, "Internal server error!");
		}
		return response;
	}

	@RequestMapping(value = "/getAllSurveys", method = RequestMethod.GET)
	public @ResponseBody JsonEntityResponse getAllSurveys() {
		JsonEntityResponse response = null;
		try {
			List<Survey> surveys = surveyService.getAllSurveys();
			response = new JsonEntityResponse(true, null, surveys);
		} catch (SurveyException ex) {
			response = new JsonEntityResponse(false, ex.getMessage());
		} catch (Exception ex) {
			response = new JsonEntityResponse(false, "Internal server error!");
		}
		return response;
	}

	@RequestMapping(value = "/getAllSurveyResults", method = RequestMethod.GET)
	public @ResponseBody JsonEntityResponse getAllSurveyResults() {
		JsonEntityResponse response = null;
		try {
			List<SurveyResult> results = surveyResultService.getAllSurveyResults();
			response = new JsonEntityResponse(true, null, results);
		} catch (SurveyException ex) {
			response = new JsonEntityResponse(false, ex.getMessage());
		} catch (Exception ex) {
			response = new JsonEntityResponse(false, "Internal server error!");
		}
		return response;
	}

	@RequestMapping(value = "/findSurveyResult", method = RequestMethod.GET)
	public @ResponseBody JsonEntityResponse findSurveyResult(@RequestParam String id) {
		JsonEntityResponse response = null;
		try {
			SurveyResult result = surveyResultService.findSurveyResult(Long.parseLong(id));
			response = new JsonEntityResponse(true, null, result);
		} catch (SurveyException ex) {
			response = new JsonEntityResponse(false, ex.getMessage());
		} catch (Exception ex) {
			response = new JsonEntityResponse(false, "Internal server error!");
		}
		return response;
	}

	@RequestMapping(value = "/findSurvey", method = RequestMethod.GET)
	public @ResponseBody JsonEntityResponse findSurvey(@RequestParam(value = "id") String id) {
		JsonEntityResponse response = null;
		try {
			Survey survey = surveyService.findSurvey(Long.parseLong(id));
			response = new JsonEntityResponse(true, null, survey);
		} catch (SurveyException ex) {
			response = new JsonEntityResponse(false, ex.getMessage());
		} catch (Exception ex) {
			response = new JsonEntityResponse(false, "Internal server error!");
		}
		return response;
	}

	@RequestMapping(value = "/deleteSurvey", method = RequestMethod.POST)
	public @ResponseBody JsonEntityResponse deleteSurvey(@RequestParam(value = "id") String id) {
		JsonEntityResponse response = null;
		try {

			Survey survey = new Survey();
			survey.setId(Long.parseLong(id));
			surveyService.deleteSurvey(survey);

			response = new JsonEntityResponse(true);
		} catch (SurveyException ex) {
			response = new JsonEntityResponse(false, ex.getMessage());
		} catch (Exception ex) {
			response = new JsonEntityResponse(false, "Internal server error!");
		}
		return response;
	}

}
