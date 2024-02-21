package restapidemo.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapidemo.springboot.entity.Student;
import restapidemo.springboot.repo.StudentRepo;
import restapidemo.springboot.service.StudentService;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student deleteStudent(String id) {
        Student student = studentRepo.findById(id).get();
        studentRepo.delete(student);
        return student;
    }

    @Override
    public Student updateStudent(String id, Student student) {
        Student existing_student =  studentRepo.findById(id).get();
        existing_student.setName(student.getName());
        existing_student.setId(student.getId());
        existing_student.setDept(student.getDept());
        studentRepo.save(existing_student);
        return existing_student;
    }
}
