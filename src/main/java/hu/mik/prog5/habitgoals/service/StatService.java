package hu.mik.prog5.habitgoals.service;

import hu.mik.prog5.habitgoals.entity.Stat;
import hu.mik.prog5.habitgoals.exception.NotFoundException;
import hu.mik.prog5.habitgoals.repository.StatRepository;
import hu.mik.prog5.habitgoals.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StatService implements CRUDService<Stat>{
    private final StatRepository statRepository;

    @Override
    public List<Stat> findAll() {
        return statRepository.findAll();
    }

    @Override
    public Stat findById(Long id) {
        return statRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public Stat save(Stat entity) {
        return statRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        statRepository.deleteById(id);
    }
}
