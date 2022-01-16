package hu.mik.prog5.habitgoals.entity;

import hu.mik.prog5.habitgoals.dto.UserDTO;
import hu.mik.prog5.habitgoals.entity.goal.Goal;
import hu.mik.prog5.habitgoals.entity.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Stat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToMany
//    @JoinColumn(name = "user_id")
//    private UserDTO user;

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
