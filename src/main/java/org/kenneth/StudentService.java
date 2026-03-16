package org.kenneth;

import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Students> getAllStudents(){
        return studentRepository.findAll();
    }

    public void insertStudent(Students student){
        studentRepository.save(student);
    }

    public Students getStudentsById(Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException( id + "not found"));
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    /* //I have a problem with this
    public void changeBook(Students student,Integer id) {
        Students student =  this.getStudentsById(id);
        student.setBook(book);
        studentRepository.save(student);
    }

     */
}
