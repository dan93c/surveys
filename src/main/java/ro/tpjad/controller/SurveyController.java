package ro.tpjad.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ro.tpjad.service.SurveyService;

@Controller
public class SurveyController {

	@Autowired
	SurveyService surveyService;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ModelAndView getAllQuestions(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView("main");
		modelAndView.addObject("questions", surveyService.getAllQuestions());

		return modelAndView;

	}
}
