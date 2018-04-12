//package ru.spbau.mit.task2;
//
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class Task2Test {
//    // Replace $CLASSNAME$ with name of your NumberBox implementation, specialized for integers
//
//
//    @Test
//    public void basicTest() {
//        $CLASSNAME$ box = new $CLASSNAME$(42);
//
//        Number n = box.get();
//        Double d = box.asDouble();
//        assertEquals(42.0, d, 1e-5);
//    }
//
//    @Test
//    public void shouldntCompile() {
//        $CLASSNAME$ box = new $CLASSNAME$(42);
//
//        Double d = box.asDouble();
//        box.put("foo"); // Compile-time error!
//    }
//
//    public void shouldGetValueOfStaticallyKnownType() {
//        $CLASSNAME$ box = new $CLASSNAME$(42);
//
//        Integer x = box.get(); // Here we should know that we can safely pull Integer
//                               // out of box, because we've created it as Integer
//    }
//}
