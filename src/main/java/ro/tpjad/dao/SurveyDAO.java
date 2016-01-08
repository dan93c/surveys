package ro.tpjad.dao;

import java.util.List;

import ro.tpjad.entity.Question;
import ro.tpjad.entity.Survey;

public interface SurveyDAO {

	void addSurvey(Survey survey);
	
	void deleteSurvey(Survey survey);
	
	List<Survey> getAllSurveys();
	
	List<Question> getAllQuestions();

	void update(Question question);

	Survey findSurvey(Long id);

}
