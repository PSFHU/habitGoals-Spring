package hu.mik.prog5.habitgoals.service;

import java.util.List;

public interface CRUDService<T> {
    List<T> listAll();

    T findById(Long id);

    T add(T type);

    T edit(T type);

    boolean deleteById(Long id);
}
