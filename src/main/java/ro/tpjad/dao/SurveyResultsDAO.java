package ro.tpjad.dao;

import java.util.List;

import ro.tpjad.entity.CompletedAnswer;
import ro.tpjad.entity.SurveyResult;

public interface SurveyResultsDAO {

	void addSurveyResult(SurveyResult surveyResult);

	void deleteSurveyResult(SurveyResult surveyResult);

	List<SurveyResult> getAllSurveyResults();

	SurveyResult findSurveyResult(Long id);

	void addCompletedAnswer(CompletedAnswer completedAnswer);

	void deleteCompletedAnswer(CompletedAnswer completedAnswer);

	List<CompletedAnswer> getAllCompletedAnswers();
}
