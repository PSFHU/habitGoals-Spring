package hu.mik.prog5.habitgoals.repository;

import hu.mik.prog5.habitgoals.entity.Progress;
import hu.mik.prog5.habitgoals.entity.Stat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatRepository extends JpaRepository<Stat,Long> {

//    List<Progress> getLastDays(int days);
}
