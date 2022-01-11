package hu.mik.prog5.habitgoals.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class MeasureField extends Measure{
    private String title;
    private List<MeasureValue> measureValueList;
}
