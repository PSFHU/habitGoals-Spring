package hu.mik.prog5.habitgoals.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class MeasureValue extends Measure{
    private Long measureFieldId;
    private double value;
    private Date date;
}
