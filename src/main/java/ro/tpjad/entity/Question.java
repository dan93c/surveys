package ro.tpjad.entity;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "QUESTIONS")
public class Question extends BaseEntity {

	private String text;
	private QuestionType type;
	private String possibleAnswers;
	private Survey survey;

	public Question() {
		super();
	}

	@Id
	@Column(name = "QSTID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public void setId(Long id) {
		super.setId(id);
	}

	@Id
	@Column(name = "QSTID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return super.getId();
	}

	@Column(name = "QSTCRTTIME")
	public void setCreateTime(Date createTime) {
		super.setCreateTime(createTime);
	}

	@Column(name = "QSTCRTTIME")
	public Date getCreateTime() {
		return super.getCreateTime();
	}

	@Column(name = "QSTUPDTIME")
	public void setUpdateTime(Date updateTime) {
		super.setUpdateTime(updateTime);
	}

	@Column(name = "QSTUPDTIME")
	public Date getUpdateTime() {
		return super.getUpdateTime();
	}

	@Column(name = "QSTCRTUSER")
	public void setCreateUser(String createUser) {
		super.setCreateUser(createUser);
	}

	@Column(name = "QSTCRTUSER")
	public String getCreateUser() {
		return super.getCreateUser();
	}

	@Column(name = "QSTUPDUSER")
	public void setUpdateUser(String updateUser) {
		super.setCreateUser(updateUser);
	}

	@Column(name = "QSTUPDUSER")
	public String getUpdateUser() {
		return super.getUpdateUser();
	}

	@Column(name = "QSTTXT")
	public String getText() {
		return text;
	}

	@Column(name = "QSTTXT")
	public void setText(String text) {
		this.text = text;
	}

	@Column(name = "QSTTYPE")
	@Enumerated(EnumType.STRING)
	public QuestionType getType() {
		return type;
	}

	@Column(name = "QSTTYPE")
	@Enumerated(EnumType.STRING)
	public void setType(QuestionType type) {
		this.type = type;
	}

	@Column(name = "QSTANS")
	@JsonIgnore
	public String getPossibleAnswers() {
		return possibleAnswers;
	}

	@Column(name = "QSTANS")
	@JsonIgnore
	public void setPossibleAnswers(String possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

	@Transient
	public List<String> getPossibleAnswersList() {
		return Arrays.asList(possibleAnswers.split(";"));
	}

	@Transient
	public void setPossibleAnswers(List<String> answers) {
		this.possibleAnswers = StringUtils.join(answers, ";");
	}

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "QSTSVY")
	public Survey getSurvey() {
		return survey;
	}

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "QSTSVY")
	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

}
