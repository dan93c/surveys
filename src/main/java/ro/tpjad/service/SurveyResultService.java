package ro.tpjad.service;

import java.util.List;

import ro.tpjad.entity.CompletedAnswer;
import ro.tpjad.entity.SurveyException;
import ro.tpjad.entity.SurveyResult;

public interface SurveyResultService {

	void addSurveyResult(SurveyResult surveyResult) throws SurveyException;

	void deleteSurveyResult(SurveyResult surveyResult) throws SurveyException;

	List<SurveyResult> getAllSurveyResults() throws SurveyException;

	SurveyResult findSurveyResult(Long id) throws SurveyException;

	void addCompletedAnswer(CompletedAnswer completedAnswer) throws SurveyException;

	void deleteCompletedAnswer(CompletedAnswer completedAnswer) throws SurveyException;

	List<CompletedAnswer> getAllCompletedAnswers() throws SurveyException;
}
