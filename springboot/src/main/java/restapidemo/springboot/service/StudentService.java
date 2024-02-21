package restapidemo.springboot.service;

import restapidemo.springboot.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getStudents();
    public Student addStudent(Student student);
    public Student deleteStudent(String id);


    public Student updateStudent(String id, Student student);
}
