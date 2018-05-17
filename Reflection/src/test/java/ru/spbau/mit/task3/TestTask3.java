package ru.spbau.mit.task3;

import org.junit.Test;
import ru.spbau.mit.task1.TypeMapper;
import ru.spbau.mit.task1.Value;
import ru.spbau.mit.task1.solution.ReflectiveTypeMapper;
import ru.spbau.mit.testData.task3.ClassWithCustomTypeMapper;

import static org.junit.Assert.assertEquals;

public class TestTask3 {
    @Test
    public void testCustomMapper() {
        Value map = getTypeMapper().map(new ClassWithCustomTypeMapper());
        assertEquals("{alsoByMapper=STRING:<STUB>, i=INT:42, shouldBeMappedByCustomMapper=STRING:<STUB>, shouldBeMappedNormally=STRING:Should be mapped normally}", map.toString());
    }

    private static TypeMapper getTypeMapper() {
        return new ReflectiveTypeMapper();
    }
}
