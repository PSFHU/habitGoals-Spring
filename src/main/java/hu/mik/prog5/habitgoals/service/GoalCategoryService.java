package hu.mik.prog5.habitgoals.service;

import hu.mik.prog5.habitgoals.entity.goal.GoalCategory;
import hu.mik.prog5.habitgoals.exception.NotFoundException;
import hu.mik.prog5.habitgoals.repository.GoalCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GoalCategoryService implements CRUDService<GoalCategory> {
    private final GoalCategoryRepository goalCategoryRepository;

    @Override
    public List<GoalCategory> findAll() {
        return goalCategoryRepository.findAll();
    }

    @Override
    public GoalCategory findById(Long id) {
        return goalCategoryRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public GoalCategory save(GoalCategory entity) {
        return goalCategoryRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        goalCategoryRepository.deleteById(id);
    }
}
