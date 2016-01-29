package ro.tpjad.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "completed_answers")
public class CompletedAnswer extends BaseEntity {

	private String text;
	private Question question;
	private SurveyResult surveyResult;

	public CompletedAnswer() {
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
	public Date getCreateTime() {
		return super.getCreateTime();
	}

	@Column(name = "CRTTIME")
	public void setCreateTime(Date createTime) {
		super.setCreateTime(createTime);
	}

	@Column(name = "UPDTIME")
	public Date getUpdateTime() {
		return super.getUpdateTime();
	}

	@Column(name = "UPDTIME")
	public void setUpdateTime(Date updateTime) {
		super.setUpdateTime(updateTime);
	}

	@Column(name = "CRTUSER")
	public String getCreateUser() {
		return super.getCreateUser();
	}

	@Column(name = "CRTUSER")
	public void setCreateUser(String createUser) {
		super.setCreateUser(createUser);
	}

	@Column(name = "UPDUSER")
	public String getUpdateUser() {
		return super.getUpdateUser();
	}

	@Column(name = "UPDUSER")
	public void setUpdateUser(String updateUser) {
		super.setUpdateUser(updateUser);
	}

	@Column(name = "TXT")
	public String getText() {
		return text;
	}

	@Column(name = "TXT")
	public void setText(String text) {
		this.text = text;
	}

	@ManyToOne
	@JoinColumn(name = "QSTID")
	public Question getQuestion() {
		return question;
	}

	@ManyToOne
	@JoinColumn(name = "QSTID")
	public void setQuestion(Question question) {
		this.question = question;
	}

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "SURVEY_RESULT")
	public SurveyResult getSurveyResult() {
		return surveyResult;
	}

	@ManyToOne
	@JoinColumn(name = "SURVEY_RESULT")
	public void setSurveyResult(SurveyResult surveyResult) {
		this.surveyResult = surveyResult;
	}

}
