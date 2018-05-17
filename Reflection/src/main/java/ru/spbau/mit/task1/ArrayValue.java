package ru.spbau.mit.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayValue implements Value {
    public final List<Value> values;

    public ArrayValue() {
        values = new ArrayList<>();
    }

    public ArrayValue(List<Value> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayValue that = (ArrayValue) o;
        return Objects.equals(values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }

    @Override
    public String toString() {
        return "ArrayValue{" +
                "values=" + values +
                '}';
    }
}
