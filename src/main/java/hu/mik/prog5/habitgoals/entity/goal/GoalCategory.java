package hu.mik.prog5.habitgoals.entity.goal;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class GoalCategory {

    @Column(nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
