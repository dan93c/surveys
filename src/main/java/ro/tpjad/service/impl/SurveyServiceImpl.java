package ro.tpjad.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.tpjad.dao.SurveyDAO;
import ro.tpjad.entity.Question;
import ro.tpjad.entity.QuestionType;
import ro.tpjad.entity.Survey;
import ro.tpjad.entity.SurveyException;
import ro.tpjad.service.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService {

	@Autowired
	SurveyDAO surveyDao;

	@Override
	@Transactional
	public void addSurvey(Survey survey) throws SurveyException {
		List<Question> questions = survey.getQuestions();
		if (StringUtils.isBlank(survey.getName())) {
			throw new SurveyException("Please enter a name for survey!");
		}
		if (StringUtils.isBlank(survey.getCreateUser())) {
			throw new SurveyException("Please enter your name!");
		}
		if (questions.isEmpty()) {
			throw new SurveyException("Please add some questions!");
		} else {
			for (Question question : questions) {
				if (StringUtils.isBlank(question.getText())) {
					throw new SurveyException("Please add question text!");
				} else if (question.getType() != QuestionType.FREE_TEXT
						&& StringUtils.isBlank(question.getText())) {
					throw new SurveyException("Please add answers to question " + question.getText() + " !");
				}
			}
		}
		surveyDao.addSurvey(survey);
	}

	@Override
	@Transactional
	public void deleteSurvey(Survey survey) throws SurveyException {
		surveyDao.deleteSurvey(survey);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Survey> getAllSurveys() throws SurveyException {
		List<Survey> surveys = surveyDao.getAllSurveys();
		System.out.println("getAllSurveys Service: " + surveys);
		for (Survey survey : surveys) {
			Hibernate.initialize(survey.getQuestions());
		}
		return surveys;
	}

	@Override
	@Transactional(readOnly = true)
	public Survey findSurvey(Long id) throws SurveyException {
		Survey survey = surveyDao.findSurvey(id);
		if (survey != null) {
			Hibernate.initialize(survey.getQuestions());
		}
		return survey;
	}

}
