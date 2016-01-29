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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "SURVEYS")
public class Survey extends BaseEntity {

	private String name;
	private String description;
	private List<Question> questions = new ArrayList<Question>();

	public Survey() {
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

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	@Column(name = "NAME")
	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCR")
	public String getDescription() {
		return description;
	}

	@Column(name = "DESCR")
	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(mappedBy = "survey", cascade = CascadeType.ALL)
	public List<Question> getQuestions() {
		return questions;
	}

	@OneToMany(mappedBy = "survey", cascade = CascadeType.ALL)
	public void setQuestions(List<Question> questions) {
		for(Question question:questions){
			question.setSurvey(this);
		}
		this.questions = questions;
	}

	public void addQuestion(Question question) {
		this.questions.add(question);
		question.setSurvey(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
