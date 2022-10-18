package homeworkGame.entities;

import java.sql.Date;

public class Person extends BaseEntities {
	public Person() {
		super();
	}

	public Person(String surname, String tc, Date birth) {
		super();
		this.surname = surname;
		this.tc = tc;
		this.birth = birth;
	}

	String surname;
	String tc;
	Date birth;

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
}