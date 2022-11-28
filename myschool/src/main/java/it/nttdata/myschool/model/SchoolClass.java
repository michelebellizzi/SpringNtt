package it.nttdata.myschool.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SchoolClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
    String name;
    Integer numberStudent;
    @OneToMany(mappedBy = "schoolClass")
    List<Student> students= new ArrayList<>();
    
    public SchoolClass(){
    	
    }
    
	public SchoolClass( String name) {
		
		this.name = name;
		
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumberStudent() {
		return numberStudent;
	}
	public void setNumberStudent(Integer numberStudent) {
		this.numberStudent = numberStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
    
}
