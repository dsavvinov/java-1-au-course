//package ru.spbau.mit.task3;
//
//import org.junit.Test;
//import ru.spbau.mit.task1.Box;
//import ru.spbau.mit.task3.solution.BoxTools;
//
//import java.util.Objects;
//import java.util.function.Function;
//import java.util.function.Supplier;
//
//import static junit.framework.TestCase.assertTrue;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertSame;
//
//public class Task3Test {
//    @Test
//    public void testContains() {
//        Base base = new Base("foo");
//        Derived derived = new Derived("foo");
//
//        Box<Base> boxWithBase = new BoxImpl<>(base);
//        Box<Derived> boxWithDerived = new BoxImpl<>(derived);
//
//        assertTrue(BoxTools.contains(boxWithBase, base));
//        assertTrue(BoxTools.contains(boxWithDerived, derived));
//
//        assertTrue(BoxTools.contains(boxWithBase, derived));
//        assertTrue(BoxTools.contains(boxWithDerived, base));
//
//        assertFalse(BoxTools.contains(boxWithBase, "foo"));
//        assertFalse(BoxTools.contains(boxWithDerived, "foo"));
//    }
//
//    @Test
//    public void testFMap() {
//        Box<Base> boxWithBase = new BoxImpl<>(new Base("a"));
//        Box<Derived> boxWithDerived = new BoxImpl<>(new Derived("aba"));
//
//        Function<Base, Integer> baseFunction = (b) -> b.s.length();
//        Function<Derived, Integer> derivedFunction = (d) -> d.s.length();
//
//        assertEquals(1, (int) BoxTools.fmap(boxWithBase, baseFunction).get());
//        assertEquals(3, (int) BoxTools.fmap(boxWithDerived, derivedFunction).get());
//
//        assertEquals(3, (int) BoxTools.fmap(boxWithDerived, baseFunction).get());
//        // Shouldn't compile:
////        assertEquals(1, (int) BoxTools.fmap(boxWithBase, derivedFunction).get());
//    }
//
//    @Test
//    public void testComputeIfAbsent() {
//        Box<Base> boxWithBase = new BoxImpl<>(null);
//        Box<Derived> boxWithDerived = new BoxImpl<>(null);
//
//        Base base = new Base("foo");
//        Derived derived = new Derived("foo");
//
//        Supplier<Base> baseSupplier = () -> base;
//        Supplier<Derived> derivedSupplier = () -> derived;
//        Supplier<String> stringSupplier = () -> "foo";
//
//        assertSame(base, BoxTools.computeIfAbsent(boxWithBase, baseSupplier));
//        assertSame(derived, BoxTools.computeIfAbsent(boxWithDerived, derivedSupplier));
//
//        assertSame(base, BoxTools.computeIfAbsent(boxWithBase, derivedSupplier));
//        // Shouldn't compile!
////        assertSame(base, BoxTools.computeIfAbsent(boxWithDerived, baseSupplier));
//    }
//
//    private static class Base {
//        public Base(String s) {
//            this.s = s;
//        }
//
//        public String s;
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Base)) return false;
//            Base base = (Base) o;
//            return Objects.equals(s, base.s);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(s);
//        }
//    }
//
//    private static class Derived extends Base {
//        public Derived(String s) {
//            super(s);
//        }
//    }
//}
