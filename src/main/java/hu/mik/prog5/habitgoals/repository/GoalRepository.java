package hu.mik.prog5.habitgoals.repository;

import hu.mik.prog5.habitgoals.entity.goal.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {
}
