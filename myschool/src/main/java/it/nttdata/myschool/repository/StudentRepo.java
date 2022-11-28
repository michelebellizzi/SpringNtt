package it.nttdata.myschool.repository;

import org.springframework.data.repository.CrudRepository;

import it.nttdata.myschool.model.Student;

public interface StudentRepo extends CrudRepository<Student, Long>{

}
