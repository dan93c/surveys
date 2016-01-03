package ro.tpjad.dao;

import java.util.List;

import ro.tpjad.entity.Question;

public interface SurveyDao {

	List<Question> getAllQuestions();

	void update(Question question);

}
