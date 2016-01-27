package ro.tpjad.service.impl;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.tpjad.dao.SurveyResultsDAO;
import ro.tpjad.entity.CompletedAnswer;
import ro.tpjad.entity.SurveyException;
import ro.tpjad.entity.SurveyResult;
import ro.tpjad.service.SurveyResultService;

@Service
public class SurveyResultServiceImpl implements SurveyResultService {

	@Autowired
	SurveyResultsDAO surveyResultDao;

	@Override
	@Transactional
	public void addSurveyResult(SurveyResult surveyResult) throws SurveyException {
		surveyResultDao.addSurveyResult(surveyResult);
	}

	@Override
	@Transactional
	public void deleteSurveyResult(SurveyResult surveyResult) throws SurveyException {
		surveyResultDao.deleteSurveyResult(surveyResult);
	}

	@Override
	@Transactional(readOnly = true)
	public List<SurveyResult> getAllSurveyResults() throws SurveyException {
		List<SurveyResult> surveys = surveyResultDao.getAllSurveyResults();
		for (SurveyResult survey : surveys) {
			Hibernate.initialize(survey.getCompletedAnswers());
		}
		return surveys;
	}

	@Override
	@Transactional(readOnly = true)
	public SurveyResult findSurveyResult(Long id) throws SurveyException {
		SurveyResult surveyResult = surveyResultDao.findSurveyResult(id);
		if (surveyResult != null) {
			Hibernate.initialize(surveyResult.getCompletedAnswers());
		}
		return surveyResult;
	}

	@Override
	@Transactional
	public void addCompletedAnswer(CompletedAnswer completedAnswer) throws SurveyException {
		surveyResultDao.addCompletedAnswer(completedAnswer);
	}

	@Override
	@Transactional
	public void deleteCompletedAnswer(CompletedAnswer completedAnswer) throws SurveyException {
		surveyResultDao.deleteCompletedAnswer(completedAnswer);
	}

	@Override
	@Transactional(readOnly = true)
	public List<CompletedAnswer> getAllCompletedAnswers() throws SurveyException {
		return surveyResultDao.getAllCompletedAnswers();
	}
}
