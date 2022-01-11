package hu.mik.prog5.habitgoals.service;

import hu.mik.prog5.habitgoals.entity.MeasureValue;

import java.util.List;

@org.springframework.stereotype.Service
public class MeasureValueCRUDService implements CRUDService<MeasureValue> {
    @Override
    public List<MeasureValue> listAll() {
        return null;
    }

    @Override
    public MeasureValue findById(Long id) {
        return null;
    }

    @Override
    public MeasureValue add(MeasureValue type) {
        return null;
    }

    @Override
    public MeasureValue edit(MeasureValue type) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
