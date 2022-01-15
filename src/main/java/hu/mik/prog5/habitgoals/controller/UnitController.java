package hu.mik.prog5.habitgoals.controller;

import hu.mik.prog5.habitgoals.entity.Unit;
import hu.mik.prog5.habitgoals.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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
    public Unit findById(Long id) {
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
