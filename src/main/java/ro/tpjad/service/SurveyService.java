package ro.tpjad.service;

import java.util.List;

import ro.tpjad.entity.Survey;
import ro.tpjad.entity.SurveyException;

public interface SurveyService {

	void addSurvey(Survey survey) throws SurveyException;

	void deleteSurvey(Survey survey) throws SurveyException;

	List<Survey> getAllSurveys() throws SurveyException;

	Survey findSurvey(Long id) throws SurveyException;

}
