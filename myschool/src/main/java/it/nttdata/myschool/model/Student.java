package it.nttdata.myschool.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
    String name;
    String surname;
    Integer age;
    
    public Student() {
 	
    }
    
    public Student(String name, String surname, Integer age, SchoolClass schoolClass) {
		
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.schoolClass = schoolClass;
	}
	@ManyToOne
    @JoinColumn(name = "schoolClass_id")
    SchoolClass schoolClass;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public SchoolClass getSchoolClass() {
		return schoolClass;
	}
	public void setSchoolClass(SchoolClass schoolClass) {
		this.schoolClass = schoolClass;
	}
}
