package ro.tpjad.entity;

import java.util.ArrayList;
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

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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

	@Column(name = "TXT")
	public String getText() {
		return text;
	}

	@Column(name = "TXT")
	public void setText(String text) {
		this.text = text;
	}

	@Column(name = "QTYPE")
	@Enumerated(EnumType.STRING)
	public QuestionType getType() {
		return type;
	}

	@Column(name = "QTYPE")
	@Enumerated(EnumType.STRING)
	public void setType(QuestionType type) {
		this.type = type;
	}

	@Column(name = "ANS")
	@JsonProperty
	public String getPossibleAnswers() {
		return possibleAnswers;
	}

	@Column(name = "ANS")
	@JsonIgnore
	public void setPossibleAnswers(String possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

	@Transient
	public List<String> getPossibleAnswersList() {
		if (possibleAnswers != null) {
			return Arrays.asList(possibleAnswers.split(";"));
		} else
			return new ArrayList<String>();
	}

	@JsonIgnore
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
