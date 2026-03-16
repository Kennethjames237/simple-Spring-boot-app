package org.kenneth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Students> getAllStudent(){
       return studentService.getAllStudents();

    }

    @PostMapping
    public void addNewStudent(@RequestBody Students student){
      studentService.insertStudent(student);
    }
}
