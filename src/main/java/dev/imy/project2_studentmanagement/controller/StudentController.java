package dev.imy.project2_studentmanagement.controller;

import dev.imy.project2_studentmanagement.model.Student;
import dev.imy.project2_studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project2")
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/findAll_")
    public ResponseEntity<List<Student>> findAll(){
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findByID_/{id}")
    public ResponseEntity<Student> findByID(@PathVariable int id){
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/students")
    public String saveStudent(@RequestBody Student student){
        studentService.save(student);
        return "Saved.";
    }

}
