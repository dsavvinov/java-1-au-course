package ru.spbau.mit.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReferenceValue implements Value {
    public final Map<String, Value> fields;

    public ReferenceValue() {
        fields = new HashMap<>();
    }

    public ReferenceValue(Map<String, Value> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReferenceValue that = (ReferenceValue) o;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

    @Override
    public String toString() {
        return fields.entrySet().stream()
                .map(Object::toString)
                .sorted()
                .collect(Collectors.joining(", ", "{", "}"));
    }
}
