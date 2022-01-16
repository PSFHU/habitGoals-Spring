package hu.mik.prog5.habitgoals.controller;

import hu.mik.prog5.habitgoals.entity.goal.GoalCategory;
import hu.mik.prog5.habitgoals.service.GoalCategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/goal-category")
@RequiredArgsConstructor
public class GoalCategoryController implements CRUDController<GoalCategory>{
    private final GoalCategoryService goalCategoryService;

    @Override
    @GetMapping
    public List<GoalCategory> findAll() {
        return goalCategoryService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public GoalCategory findById(Long id) {
        return goalCategoryService.findById(id);
    }

    @Override
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GoalCategory save(GoalCategory entity) {
        return goalCategoryService.save(entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteById(Long id) {
        goalCategoryService.deleteById(id);
    }
}
