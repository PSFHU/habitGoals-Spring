package hu.mik.prog5.habitgoals.entity.goal;

import lombok.Getter;

public enum GoalLogic {
    EQUAL("="), LOWER("<"), HIGHER(">"),LOWER_EQUAL("<="),HIGHER_EQUAL(">=");

    @Getter
    private final String label;

    GoalLogic(String label){
        this.label = label;
    }
}
