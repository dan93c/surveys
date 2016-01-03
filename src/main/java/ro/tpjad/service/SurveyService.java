package ro.tpjad.service;

import java.util.List;

import ro.tpjad.entity.Question;

public interface SurveyService {
	
	List<Question> getAllQuestions();

	void update(Question question);
}
