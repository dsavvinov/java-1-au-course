package ru.spbau.mit.task2;

import org.junit.Test;
import ru.spbau.mit.task1.TypeMapper;
import ru.spbau.mit.task1.Value;
import ru.spbau.mit.task1.solution.ReflectiveTypeMapper;
import ru.spbau.mit.testData.task2.ClassWithIgnoredField;

import static org.junit.Assert.assertEquals;

public class TestTask2 {
    @Test
    public void testIgnore() {
        Value map = getTypeMapper().map(new ClassWithIgnoredField());
        assertEquals("{i=INT:42, simple={value=STRING:Hello, Reflection!}}", map.toString());
    }

    private static TypeMapper getTypeMapper() {
        return new ReflectiveTypeMapper();
    }
}
