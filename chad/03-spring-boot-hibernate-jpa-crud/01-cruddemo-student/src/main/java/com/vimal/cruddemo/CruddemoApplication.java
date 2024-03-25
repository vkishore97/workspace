package com.vimal.cruddemo;

import com.vimal.cruddemo.dao.StudentDAO;
import com.vimal.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			System.out.println("Hello World");
//			createStudent(studentDAO);
			createMultipleStudent(studentDAO);
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			queryForStudentsByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAll(studentDAO);
		};
	}

	private void deleteAll(StudentDAO studentDAO) {

		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: "+numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId=5;
		System.out.println("Deleting student id: "+studentId);
		studentDAO.delete(studentId);
	}


	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating a new Student object...");
		Student tempStudent = new Student("Paul","Doe","paul@doe.com");

		//save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		//display the id of the saved student
		System.out.println("Saved Student. Generated ID: "+tempStudent.getId());

	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creatin new Student object...");
		Student tempStudent1 = new Student("Pawan","Lalwani","pawan@lalwani.com");
		Student tempStudent2 = new Student("Sanjit","Patro","sanjit@patro.com");
		Student tempStudent3 = new Student("John","Moriarty","john@moriarty.com");

		//save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		//display the id of the saved student
		System.out.println("Saved Student. Generated ID: "+tempStudent1.getId());
		System.out.println("Saved Student. Generated ID: "+tempStudent2.getId());
		System.out.println("Saved Student. Generated ID: "+tempStudent3.getId());

	}

	private void readStudent(StudentDAO studentDAO) {
		//create a student object
		System.out.println("Creating a new student object...");
		Student tempStudent = new Student("Goofy","Doggo","goofy@doggo.com");

		//save the student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		//display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved Student. Generated ID: "+ theId);

		//retrieve student based on the id : primary key
		System.out.println("Retrieving the student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		//display student
		System.out.println("Found the student: " + myStudent);
	}

	private void queryForStudents(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudents = studentDAO.findAll();

		//display list of students
		for(Student tempStudent:theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Patro");

		//display list of students
		for(Student tempStudent:theStudents) {
			System.out.println(tempStudent);
		}


	}
	private void updateStudent(StudentDAO studentDAO) {
		//retrieve the student based on the id : primary key
		int studentId = 1;
		System.out.println("Getting student with: "+studentId);
		Student myStudent = studentDAO.findById(studentId);

		//change first name to "Scooby"
		System.out.println("Updating student...");
		myStudent.setFirstName("Scooby");

		//update the student
		studentDAO.update(myStudent);

		//display the updated student
		System.out.println("Updated student: "+myStudent);

	}



}