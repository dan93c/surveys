package ro.tpjad.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "survey_results")
public class SurveyResult extends BaseEntity {

	private Survey survey;
	private List<CompletedAnswer> completedAnswers = new ArrayList<CompletedAnswer>();

	public SurveyResult() {
		super();
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public void setId(Long id) {
		super.setId(id);
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return super.getId();
	}

	@Column(name = "CRTTIME")
	public void setCreateTime(Date createTime) {
		super.setCreateTime(createTime);
	}

	@Column(name = "CRTTIME")
	public Date getCreateTime() {
		return super.getCreateTime();
	}

	@Column(name = "UPDTIME")
	public void setUpdateTime(Date updateTime) {
		super.setUpdateTime(updateTime);
	}

	@Column(name = "UPDTIME")
	public Date getUpdateTime() {
		return super.getUpdateTime();
	}

	@Column(name = "CRTUSER")
	public void setCreateUser(String createUser) {
		super.setCreateUser(createUser);
	}

	@Column(name = "CRTUSER")
	public String getCreateUser() {
		return super.getCreateUser();
	}

	@Column(name = "UPDUSER")
	public void setUpdateUser(String updateUser) {
		super.setCreateUser(updateUser);
	}

	@Column(name = "UPDUSER")
	public String getUpdateUser() {
		return super.getUpdateUser();
	}

	@ManyToOne
	@JoinColumn(name = "SURVEY")
	public Survey getSurvey() {
		return survey;
	}

	@ManyToOne
	@JoinColumn(name = "SURVEY")
	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	@OneToMany(mappedBy = "surveyResult", cascade = CascadeType.ALL)
	public List<CompletedAnswer> getCompletedAnswers() {
		return completedAnswers;
	}

	@OneToMany(mappedBy = "surveyResult", cascade = CascadeType.ALL)
	public void setCompletedAnswers(List<CompletedAnswer> completedAnswers) {
		for (CompletedAnswer answer : completedAnswers) {
			answer.setSurveyResult(this);
		}
		this.completedAnswers = completedAnswers;
	}

	public void addCompletedAnswer(CompletedAnswer copletedAnswer) {
		this.completedAnswers.add(copletedAnswer);
	}
}
