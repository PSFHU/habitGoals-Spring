package hu.mik.prog5.habitgoals.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Goal {
    private Long id;
    private String title;
    private Boolean isCompleted;
}
