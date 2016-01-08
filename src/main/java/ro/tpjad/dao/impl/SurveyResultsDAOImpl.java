package ro.tpjad.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ro.tpjad.dao.SurveyResultsDAO;
import ro.tpjad.entity.CompletedAnswer;
import ro.tpjad.entity.SurveyResult;

@Repository
public class SurveyResultsDAOImpl implements SurveyResultsDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void addSurveyResult(SurveyResult surveyResult) {
		getEntityManager().persist(surveyResult);
	}

	@Override
	public void deleteSurveyResult(SurveyResult surveyResult) {
		getEntityManager().remove(entityManager);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SurveyResult> getAllSurveyResults() {
		Query query = getEntityManager().createQuery(
				"select s from SurveyResult s");
		return query.getResultList();
	}

	@Override
	public SurveyResult findSurveyResult(Long id) {
		return getEntityManager().find(SurveyResult.class, id);
	}

	@Override
	public void addCompletedAnswer(CompletedAnswer completedAnswer) {
		getEntityManager().persist(completedAnswer);
	}

	@Override
	public void deleteCompletedAnswer(CompletedAnswer completedAnswer) {
		getEntityManager().remove(completedAnswer);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CompletedAnswer> getAllCompletedAnswers() {
		Query query = getEntityManager().createQuery(
				"select a from CompletedAnswer a");
		return query.getResultList();
	}
}
