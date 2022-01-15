package hu.mik.prog5.habitgoals.controller;

import java.util.List;

public interface CRUDController<T> {
    List<T> findAll();
    T findById(Long id);
    T save(T entity);
    void deleteById(Long id);
}
