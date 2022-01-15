package hu.mik.prog5.habitgoals.repository;

import hu.mik.prog5.habitgoals.entity.Progress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressRepository extends JpaRepository<Progress, Long> {

}
