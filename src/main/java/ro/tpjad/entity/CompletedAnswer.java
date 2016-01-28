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
	@Column(name = "ANSID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public void setId(Long id) {
		super.setId(id);
	}

	@Id
	@Column(name = "ANSID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return super.getId();
	}

	@Column(name = "ANSCRTTIME")
	public Date getCreateTime() {
		return super.getCreateTime();
	}

	@Column(name = "ANSCRTTIME")
	public void setCreateTime(Date createTime) {
		super.setCreateTime(createTime);
	}

	@Column(name = "ANSUPDTIME")
	public Date getUpdateTime() {
		return super.getUpdateTime();
	}

	@Column(name = "ANSUPDTIME")
	public void setUpdateTime(Date updateTime) {
		super.setUpdateTime(updateTime);
	}

	@Column(name = "ANSCRTUSER")
	public String getCreateUser() {
		return super.getCreateUser();
	}

	@Column(name = "ANSCRTUSER")
	public void setCreateUser(String createUser) {
		super.setCreateUser(createUser);
	}

	@Column(name = "ANSUPDUSER")
	public String getUpdateUser() {
		return super.getUpdateUser();
	}

	@Column(name = "ANSUPDUSER")
	public void setUpdateUser(String updateUser) {
		super.setUpdateUser(updateUser);
	}

	@Column(name = "ANSTXT")
	public String getText() {
		return text;
	}

	@Column(name = "ANSTXT")
	public void setText(String text) {
		this.text = text;
	}

	@ManyToOne
	@JoinColumn(name = "ANSQST")
	public Question getQuestion() {
		return question;
	}

	@ManyToOne
	@JoinColumn(name = "ANSQST")
	public void setQuestion(Question question) {
		this.question = question;
	}

	@ManyToOne
	@JoinColumn(name = "ANSSVR")
	public SurveyResult getSurveyResult() {
		return surveyResult;
	}

	@ManyToOne
	@JoinColumn(name = "ANSSVR")
	public void setSurveyResult(SurveyResult surveyResult) {
		this.surveyResult = surveyResult;
	}

}
