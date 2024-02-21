package restapidemo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapidemo.springboot.entity.Student;
import restapidemo.springboot.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getStudents(){
        return studentService.getStudents();


    }
    @PostMapping("/insert")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @DeleteMapping("/delete/{id}")
    public Student deleteStudent(@PathVariable String id){
        return studentService.deleteStudent(id);
    }

    @PostMapping("/update/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }


}
