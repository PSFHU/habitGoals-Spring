package hu.mik.prog5.habitgoals.controller;

import hu.mik.prog5.habitgoals.entity.Unit;
import hu.mik.prog5.habitgoals.service.UnitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/unit")
@RequiredArgsConstructor
public class UnitController implements CRUDController<Unit>{

    private final UnitService unitService;

    @Override
    @GetMapping
    public List<Unit> findAll() {
        return this.unitService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Unit findById(@PathVariable Long id) {
        return this.unitService.findById(id);
    }

    @Override
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Unit save(@RequestBody Unit entity) {
        return this.unitService.save(entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        this.unitService.deleteById(id);
    }
}
