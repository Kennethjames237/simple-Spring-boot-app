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

    @GetMapping("{id}")
    public Students getStudentById(@PathVariable Integer id){
        return studentService.getStudentsById(id);
    }

    @PostMapping
    public void addNewStudent(@RequestBody Students student){
      studentService.insertStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }
    /*//I have a problem with that....
    @PutMapping("/{id}")
    public void changeBook(@RequestBody Students student, @PathVariable Integer id){
        studentService.changeBook(student,id);
    }

     */
}
