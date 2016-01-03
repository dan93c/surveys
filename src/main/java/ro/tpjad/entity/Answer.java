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
@Table(name = "ANSWERS")
public class Answer extends BaseEntity {

	private String text;
	private Question question;

	public Answer() {
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
	public void setCreateTime(Date createTime) {
		super.setCreateTime(createTime);
	}

	@Column(name = "ANSCRTTIME")
	public Date getCreateTime() {
		return super.getCreateTime();
	}

	@Column(name = "ANSUPDTIME")
	public void setUpdateTime(Date updateTime) {
		super.setUpdateTime(updateTime);
	}

	@Column(name = "ANSUPDTIME")
	public Date getUpdateTime() {
		return super.getUpdateTime();
	}

	@Column(name = "ANSCRTUSR")
	public void setCreateUser(String createUser) {
		super.setCreateUser(createUser);
	}

	@Column(name = "ANSCRTUSR")
	public String getCreateUser() {
		return super.getCreateUser();
	}

	@Column(name = "ANSUPDUSR")
	public void setUpdateUser(String updateUser) {
		super.setCreateUser(updateUser);
	}

	@Column(name = "ANSUPDUSR")
	public String getUpdateUser() {
		return super.getUpdateUser();
	}

	@Column(name = "ANSTEXT")
	public String getText() {
		return text;
	}

	@Column(name = "ANSTEXT")
	public void setText(String text) {
		this.text = text;
	}

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "ANSQST")
	public Question getQuestion() {
		return question;
	}

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "ANSQST")
	public void setQuestion(Question question) {
		this.question = question;
	}

}
