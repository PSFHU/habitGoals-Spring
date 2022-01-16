package hu.mik.prog5.habitgoals.controller;

import hu.mik.prog5.habitgoals.entity.goal.Goal;
import hu.mik.prog5.habitgoals.service.GoalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/goal")
@RequiredArgsConstructor
public class GoalController implements CRUDController<Goal>{
    private final GoalService goalService;

    @Override
    @GetMapping
    public List<Goal> findAll() {
        return goalService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Goal findById(Long id) {
        return goalService.findById(id);
    }

    @Override
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Goal save(Goal entity) {
        return goalService.save(entity);
    }


    @Override
    @DeleteMapping("/{id}")
    public void deleteById(Long id) {
        goalService.deleteById(id);
    }
}
