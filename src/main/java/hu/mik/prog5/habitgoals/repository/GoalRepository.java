package hu.mik.prog5.habitgoals.repository;

import hu.mik.prog5.habitgoals.entity.Goal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoalRepository extends MongoRepository<Goal, String>{
}
