package hu.mik.prog5.habitgoals.entity;

import hu.mik.prog5.habitgoals.entity.goal.Goal;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Stat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long uid;
    @ManyToOne
    @JoinColumn(name = "unit_type_id")
    private Unit unit;
    @ManyToOne
    @JoinColumn(name = "goal_id")
    private Goal goal;
    @ManyToMany
    @JoinTable(name = "progress_stat",joinColumns = @JoinColumn(name = "stat_id"),inverseJoinColumns = @JoinColumn(name = "progress_id"))
    private List<Progress> progressList;
}
