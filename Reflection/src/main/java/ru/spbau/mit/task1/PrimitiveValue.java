package ru.spbau.mit.task1;

import java.util.Objects;

public class PrimitiveValue implements Value {
    public final PrimitiveType primitiveType;
    public final String stringRepresentation;

    public PrimitiveValue(PrimitiveType primitiveType, String stringRepresentation) {
        this.primitiveType = primitiveType;
        this.stringRepresentation = stringRepresentation;
    }

    public enum PrimitiveType {
        BYTE,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        BOOLEAN,
        VOID,
        STRING
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimitiveValue that = (PrimitiveValue) o;
        return primitiveType == that.primitiveType &&
                Objects.equals(stringRepresentation, that.stringRepresentation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primitiveType, stringRepresentation);
    }

    @Override
    public String toString() {
        return primitiveType.name() + ":" + stringRepresentation;
    }
}
