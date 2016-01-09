package ro.tpjad.service.impl;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.tpjad.dao.SurveyDAO;
import ro.tpjad.entity.Survey;
import ro.tpjad.service.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService {

	@Autowired
	SurveyDAO surveyDao;

	@Override
	@Transactional
	public void addSurvey(Survey survey) {
		surveyDao.addSurvey(survey);
	}

	@Override
	@Transactional
	public void deleteSurvey(Survey survey) {
		surveyDao.deleteSurvey(survey);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Survey> getAllSurveys() {
		List<Survey> surveys = surveyDao.getAllSurveys();
		System.out.println("getAllSurveys Service: " + surveys);
		for (Survey survey : surveys) {
			Hibernate.initialize(survey.getQuestions());
		}
		return surveys;
	}

	@Override
	@Transactional(readOnly = true)
	public Survey findSurvey(Long id) {
		Survey survey = surveyDao.findSurvey(id);
		if (survey != null) {
			Hibernate.initialize(survey.getQuestions());
		}
		return survey;
	}

}
