package hu.mik.prog5.habitgoals.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CRUDService<T> {
    List<T> findAll();
    T findById(Long id);
    T save(T entity);
    void deleteById(Long id);
}
