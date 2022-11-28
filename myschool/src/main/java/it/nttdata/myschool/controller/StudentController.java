package it.nttdata.myschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.nttdata.myschool.repository.SchoolClassRepo;
import it.nttdata.myschool.repository.StudentRepo;

@Controller
public class StudentController {
	private StudentRepo studentRepo;
	
	private SchoolClassRepo schoolClassRepo;
	
	public StudentController(StudentRepo studentRepo, SchoolClassRepo schoolClassRepo) {
		this.studentRepo = studentRepo;
		this.schoolClassRepo = schoolClassRepo;
	}
	
	@GetMapping("/students")
	public String getAllStudent(Model model) {
		model.addAttribute("students", studentRepo.findAll());
		return "students";
		
	}
	
	 
}
