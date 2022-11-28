package it.nttdata.myschool.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.nttdata.myschool.model.SchoolClass;
import it.nttdata.myschool.model.Student;
import it.nttdata.myschool.repository.SchoolClassRepo;
import it.nttdata.myschool.repository.StudentRepo;

@Component
public class BootStrapData implements CommandLineRunner{
	@Autowired
	SchoolClassRepo schoolClassRepo;
	@Autowired
	StudentRepo studentRepo;
	
	@Override
	public void run(String... args) throws Exception{
		SchoolClass schoolClass= new SchoolClass("C1");
		
		Student student= new Student("Mark","Ciao",18,schoolClass);
		
		schoolClassRepo.save(schoolClass);
		studentRepo.save(student);
		
		
	}

}
