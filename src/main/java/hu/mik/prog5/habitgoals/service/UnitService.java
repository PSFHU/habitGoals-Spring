package hu.mik.prog5.habitgoals.service;

import hu.mik.prog5.habitgoals.entity.Unit;
import hu.mik.prog5.habitgoals.exception.NotFoundException;
import hu.mik.prog5.habitgoals.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UnitService implements CRUDService<Unit>{
    private final UnitRepository unitRepository;

    @Override
    public List<Unit> findAll() {
        return unitRepository.findAll();
    }

    @Override
    public Unit findById(Long id) {
        return unitRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public Unit save(Unit entity) {
        return unitRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        unitRepository.deleteById(id);
    }
}
