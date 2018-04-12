package ru.spbau.mit.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1Test {

    @Test
    public void checkBasicFunctionality() {
        Box<Integer> box = getBoxInstance(42);

        assertEquals(42, (int) box.get());
        box.put(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, (int) box.get());
    }

    @Test(expected = ClassCastException.class)
    public void failWithClassCastException() {
        throw new UnsupportedOperationException("Implement me!");
    }

//    public void wontCompile() {
//        Box<Number> box = this.<Integer>getBoxInstance(42);
//    }


    private <T> Box<T> getBoxInstance(T initialValue) {
        throw new UnsupportedOperationException("Change this to your implementation instantiation!");
    }
}