package net.Management001.Student_mgt_system_SpringBoot.Controller;

import net.Management001.Student_mgt_system_SpringBoot.Entity.Student;
import net.Management001.Student_mgt_system_SpringBoot.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StudentController {
@Autowired
    StudentRepository studentRepository;

    // Get all Students from database

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        List<Student> allStudents=studentRepository.findAll();

        return allStudents;
    }

    // Finding A certain Student From Database by Id

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable long id){
        Student student=studentRepository.findById(id).get();
        return student;
    }


    // Add A student To the Database
    @PostMapping("/students/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student){
        studentRepository.save(student);
    }

    // Update Student's Information in Database

    @PutMapping("/update/{id}")
    public Student updatestudent(@PathVariable long id){
        Student student=studentRepository.findById(id).get();
        return student;
    }

     //Delete Selected student with mentioned Id
    @DeleteMapping("/Delete/{id}")
    public void deleteStudent(@PathVariable long id){
        studentRepository.deleteById(id);
    }

}

