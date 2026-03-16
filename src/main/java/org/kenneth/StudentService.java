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
}
