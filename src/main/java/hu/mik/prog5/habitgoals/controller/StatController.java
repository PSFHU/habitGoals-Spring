package hu.mik.prog5.habitgoals.controller;

import hu.mik.prog5.habitgoals.entity.Stat;
import hu.mik.prog5.habitgoals.service.StatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/stat")
@RequiredArgsConstructor
public class StatController implements CRUDController<Stat>{
    private final StatService statService;

    @Override
    @GetMapping
    public List<Stat> findAll() {
        return statService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Stat findById(Long id) {
        return statService.findById(id);
    }

    @Override
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Stat save(Stat entity) {
        return statService.save(entity);
    }


    @Override
    @DeleteMapping("/{id}")
    public void deleteById(Long id) {
        statService.deleteById(id);
    }
}
