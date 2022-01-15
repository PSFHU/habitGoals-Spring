package hu.mik.prog5.habitgoals.entity.goal;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "goal")
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "goal_value")
    private Double value;
    @Column(name = "goal_logic")
    @Enumerated(EnumType.STRING)
    private GoalLogic goalLogic = GoalLogic.EQUAL;

    @ManyToOne
    private GoalCategory goalCategory;
}
