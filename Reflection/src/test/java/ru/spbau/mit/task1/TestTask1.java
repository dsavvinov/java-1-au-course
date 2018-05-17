package ru.spbau.mit.task1;

import org.junit.Test;
import ru.spbau.mit.task1.solution.ReflectiveTypeMapper;
import ru.spbau.mit.testData.task1.*;

import static org.junit.Assert.assertEquals;

public class TestTask1 {

    @Test
    public void testSimple() {
        Value map = getTypeMapper().map(new Simple());
        assertEquals("{value=STRING:Hello, Reflection!}", map.toString());
    }

    @Test
    public void testPrimitives() {
        Value map = getTypeMapper().map(new AllPrimitives());
        assertEquals("{bool=BOOLEAN:true, bt=BYTE:4, d=DOUBLE:2.71, f=FLOAT:3.14, i=INT:1, l=LONG:2, s=STRING:some string, sh=SHORT:3}", map.toString());
    }

    @Test
    public void testNested() {
        Value map = getTypeMapper().map(new Nested());
        assertEquals("{simple={value=STRING:Hello, Reflection!}, value=STRING:outerValue}", map.toString());
    }

    @Test
    public void testArray() {
        Value map = getTypeMapper().map(new PrimitiveArray());
        assertEquals("{array=ArrayValue{values=[INT:1, INT:2, INT:3, INT:4]}}", map.toString());
    }

    @Test
    public void testInheritance() {
        Value map = getTypeMapper().map(new Derived());
        assertEquals("{i=INT:42, s=STRING:Derived}", map.toString());
    }

    @Test
    public void testVoid() {
        Value map = getTypeMapper().map(bottom());
        assertEquals("VOID:null", map.toString());
    }

    // Wow, such type system, much safety
    private Void bottom() {
        return null;
    }

    private static TypeMapper getTypeMapper() {
        return new ReflectiveTypeMapper();
    }
}
