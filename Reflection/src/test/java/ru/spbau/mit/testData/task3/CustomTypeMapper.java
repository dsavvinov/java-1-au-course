package ru.spbau.mit.testData.task3;

import ru.spbau.mit.task1.PrimitiveValue;
import ru.spbau.mit.task1.TypeMapper;
import ru.spbau.mit.task1.Value;

public class CustomTypeMapper implements TypeMapper {
    @Override
    public Value map(Object instance) {
        return new PrimitiveValue(PrimitiveValue.PrimitiveType.STRING, "<STUB>");
    }
}
