package ro.tpjad.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ro.tpjad.dao.SurveyDao;
import ro.tpjad.entity.Question;

@Repository
public class SurveyDaoImpl implements SurveyDao {

	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<Question> getAllQuestions() {
		Query query = getEntityManager().createQuery("select q from Question q");
		return query.getResultList();
	}

	public void update(Question question) {
		getEntityManager().merge(question);
	}

}
