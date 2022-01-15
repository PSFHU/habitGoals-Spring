package hu.mik.prog5.habitgoals.service;

import hu.mik.prog5.habitgoals.entity.Progress;
import hu.mik.prog5.habitgoals.exception.NotFoundException;
import hu.mik.prog5.habitgoals.repository.ProgressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProgressService implements CRUDService<Progress>{
    private ProgressRepository progressRepository;

    @Override
    public List findAll() {
        return progressRepository.findAll();
    }

    @Override
    public Progress findById(Long id) {
        return progressRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public Progress save(Progress entity) {
        return progressRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        progressRepository.deleteById(id);
    }
}
