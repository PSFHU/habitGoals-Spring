package hu.mik.prog5.habitgoals.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class SideGoal extends Goal{
    private Long mainGoalId;
    private Long measureFieldId;
    private double goalValue;
}
