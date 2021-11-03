package dev.imy.project2_studentmanagement.service;

import dev.imy.project2_studentmanagement.dao.StudentDAO;
import dev.imy.project2_studentmanagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService implements BaseService<Student> {

    private StudentDAO studentDAO;

    @Autowired
    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public StudentService() {
    }

    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public Student findById(int id) {
        return (Student) studentDAO.findById(id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return (Student) studentDAO.save(student);
    }

    @Override
    public Student update(Student object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
