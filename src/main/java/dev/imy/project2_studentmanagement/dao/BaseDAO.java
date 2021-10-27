package dev.imy.project2_studentmanagement.dao;

import java.util.List;

public interface BaseDAO<T> {

    List<T> findAll();
    T findById(int id);
    T save(T object);
    T update(T object, int id);
    void deleteById(int id);

}
