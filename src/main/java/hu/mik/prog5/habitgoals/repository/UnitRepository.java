package hu.mik.prog5.habitgoals.repository;

import hu.mik.prog5.habitgoals.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit,Long> {
}
