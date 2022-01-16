package hu.mik.prog5.habitgoals.controller;

import hu.mik.prog5.habitgoals.entity.Progress;
import hu.mik.prog5.habitgoals.service.ProgressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/progress")
@RequiredArgsConstructor
public class ProgressController implements CRUDController<Progress>{
    private final ProgressService progressService;

    @Override
    @GetMapping
    public List<Progress> findAll() {
        return progressService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Progress findById(Long id) {
        return progressService.findById(id);
    }

    @Override
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Progress save(Progress entity) {
        return progressService.save(entity);
    }


    @Override
    @DeleteMapping("/{id}")
    public void deleteById(Long id) {
        progressService.deleteById(id);
    }
}
