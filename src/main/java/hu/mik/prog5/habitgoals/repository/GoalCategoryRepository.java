package hu.mik.prog5.habitgoals.repository;

import hu.mik.prog5.habitgoals.entity.goal.GoalCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalCategoryRepository extends JpaRepository<GoalCategory,Long> {
}
