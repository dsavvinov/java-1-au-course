//package ru.spbau.mit.task5;
//
//import org.junit.Test;
//import ru.spbau.mit.task5.solution.TransformableBox;
//
//import static org.junit.Assert.assertEquals;
//
//public class Task6Test {
//    @Test
//    public void testStreamLikeAPI() {
//        TransformableBox<Integer> box = new IntBox(42);
//
//        box
//                .transform(x -> x + 3)
//                .peek(x -> assertEquals(45, (int) x))
//                .transform(x -> x / 2)
//                .peek(x -> assertEquals(22, (int) x))
//                .transform(x -> x + 20)
//                .peek(x -> assertEquals(42, (int) x));
//    }
//}
