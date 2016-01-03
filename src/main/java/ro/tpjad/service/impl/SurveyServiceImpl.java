package ro.tpjad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.tpjad.dao.SurveyDao;
import ro.tpjad.entity.Question;
import ro.tpjad.service.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService {

	@Autowired
	SurveyDao surveyDao;

	@Override
	@Transactional(readOnly = true)
	public List<Question> getAllQuestions() {
		return surveyDao.getAllQuestions();
	}

	@Override
	@Transactional
	public void update(Question question) {
		surveyDao.update(question);
	}

}
