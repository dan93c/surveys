package ro.tpjad.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTIONS")
public class Question extends BaseEntity {

	private String text;
	private List<Answer> correctAnswers = new ArrayList<Answer>();

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

	@Column(name = "QSTCRTUSR")
	public void setCreateUser(String createUser) {
		super.setCreateUser(createUser);
	}

	@Column(name = "QSTCRTUSR")
	public String getCreateUser() {
		return super.getCreateUser();
	}

	@Column(name = "QSTUPDUSR")
	public void setUpdateUser(String updateUser) {
		super.setCreateUser(updateUser);
	}

	@Column(name = "QSTUPDUSR")
	public String getUpdateUser() {
		return super.getUpdateUser();
	}

	@Column(name = "QSTTEXT")
	public String getText() {
		return text;
	}

	@Column(name = "QSTTEXT")
	public void setText(String text) {
		this.text = text;
	}

	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	public List<Answer> getCorrectAnswers() {
		return correctAnswers;
	}

	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	public void setCorrectAnswers(List<Answer> correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

}
