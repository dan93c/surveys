package ro.tpjad.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ro.tpjad.dao.SurveyDAO;
import ro.tpjad.entity.Question;
import ro.tpjad.entity.Survey;

@Repository
public class SurveyDAOImpl implements SurveyDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void addSurvey(Survey survey) {
		getEntityManager().persist(survey);
	}

	@Override
	public Survey findSurvey(Long id) {
		return getEntityManager().find(Survey.class, id);
	}

	@Override
	public void deleteSurvey(Survey survey) {
		getEntityManager().remove(survey);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Survey> getAllSurveys() {
		Query query = getEntityManager().createQuery("select s from Survey s");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Question> getAllQuestions() {
		Query query = getEntityManager()
				.createQuery("select q from Question q");
		return query.getResultList();
	}

	public void update(Question question) {
		getEntityManager().merge(question);
	}

}
