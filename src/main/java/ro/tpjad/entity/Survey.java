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
	@Column(name = "SVYID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public void setId(Long id) {
		super.setId(id);
	}

	@Id
	@Column(name = "SVYID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return super.getId();
	}

	@Column(name = "SVYCRTTIME")
	public Date getCreateTime() {
		return super.getCreateTime();
	}

	@Column(name = "SVYCRTTIME")
	public void setCreateTime(Date createTime) {
		super.setCreateTime(createTime);
	}

	@Column(name = "SVYUPDTIME")
	public Date getUpdateTime() {
		return super.getUpdateTime();
	}

	@Column(name = "SVYUPDTIME")
	public void setUpdateTime(Date updateTime) {
		super.setUpdateTime(updateTime);
	}

	@Column(name = "SVYCRTUSER")
	public String getCreateUser() {
		return super.getCreateUser();
	}

	@Column(name = "SVYCRTUSER")
	public void setCreateUser(String createUser) {
		super.setCreateUser(createUser);
	}

	@Column(name = "SVYUPDUSER")
	public String getUpdateUser() {
		return super.getUpdateUser();
	}

	@Column(name = "SVYUPDUSER")
	public void setUpdateUser(String updateUser) {
		super.setUpdateUser(updateUser);
	}

	@Column(name = "SVYNAME")
	public String getName() {
		return name;
	}

	@Column(name = "SVYNAME")
	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "SVYDSC")
	public String getDescription() {
		return description;
	}

	@Column(name = "SVYDSC")
	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(mappedBy = "survey", cascade = CascadeType.ALL)
	public List<Question> getQuestions() {
		return questions;
	}

	@OneToMany(mappedBy = "survey", cascade = CascadeType.ALL)
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public void addQuestion(Question question) {
		this.questions.add(question);
	}
}
