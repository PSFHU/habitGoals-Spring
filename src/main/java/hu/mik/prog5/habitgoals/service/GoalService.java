package hu.mik.prog5.habitgoals.service;

import hu.mik.prog5.habitgoals.entity.goal.Goal;
import hu.mik.prog5.habitgoals.exception.NotFoundException;
import hu.mik.prog5.habitgoals.repository.GoalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GoalService implements CRUDService<Goal>{
    private final GoalRepository goalRepository;

    @Override
    public List findAll() {
        return goalRepository.findAll();
    }

    @Override
    public Goal findById(Long id) {
        return goalRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public Goal save(Goal entity) {
        return goalRepository.save(entity);
    }


    @Override
    public void deleteById(Long id) {
        goalRepository.deleteById(id);
    }
}
