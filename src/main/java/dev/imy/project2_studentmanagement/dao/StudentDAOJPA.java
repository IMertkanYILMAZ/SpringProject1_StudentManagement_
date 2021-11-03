package dev.imy.project2_studentmanagement.dao;

import dev.imy.project2_studentmanagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDAOJPA implements StudentDAO<Student> {

    private EntityManager entityManager;

    @Autowired
    public StudentDAOJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("FROM Student s", Student.class).getResultList();
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public Student update(Student object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
