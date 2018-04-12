//package ru.spbau.mit.task4;
//
//import org.junit.Test;
//import ru.spbau.mit.task4.solution.OrderedBox;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//public class Task5Test {
//
//    @Test
//    public void testTestSimple() {
//        List<Integer> initialNumbers = new ArrayList<>(Arrays.asList(1, 42, -1, -1, 12321312));
//        List<OrderedBox<Integer>> orderedBoxes = wrapInBoxes(initialNumbers);
//
//        orderedBoxes.sort(Comparator.naturalOrder());
//        initialNumbers.sort(Comparator.naturalOrder());
//
//        List<Integer> sortedNumbers = orderedBoxes.stream().map(OrderedBox::get).collect(Collectors.toList());
//        assertEquals(initialNumbers, sortedNumbers);
//    }
//
//    @Test
//    public void testComplex() {
//        NegativeNumber minus1 = asNegativeNumber(-1);
//        NegativeNumber minus42 = asNegativeNumber(-42);
//
//        OrderedBox<NegativeNumber> b1 = new OrderedBox<>(minus1);
//        OrderedBox<NegativeNumber> b2 = new OrderedBox<>(minus42);
//
//        assertTrue(b1.compareTo(b2) > 0);
//    }
//
//    private static NegativeNumber asNegativeNumber(Integer i) {
//        assert i < 0;
//        return new NegativeNumber(Integer.MAX_VALUE - Math.abs(i));
//    }
//
//    private static PositiveNumber asPositiveNumber(Integer i) {
//        assert i >= 0;
//        return new PositiveNumber(Integer.MIN_VALUE + i);
//    }
//
//
//    private interface ExtendedIntegers extends Comparable<ExtendedIntegers>{
//    }
//
//    private static final class NegativeNumber implements ExtendedIntegers {
//        private final Integer value;
//
//        private NegativeNumber(Integer value) {
//            this.value = value;
//        }
//
//        @Override
//        public int compareTo(ExtendedIntegers o) {
//            if (o instanceof PositiveNumber) {
//                return -1;
//            } else if (o instanceof NegativeNumber) {
//                return Integer.compare(value, ((NegativeNumber) o).value);
//            } else {
//                throw new IllegalStateException("Unknown ExtendedIntegers subtype: " + o);
//            }
//        }
//    }
//
//    // Or zero, actually
//    private static final class PositiveNumber implements ExtendedIntegers {
//        private final Integer value;
//
//
//        private PositiveNumber(Integer value) {
//            this.value = value;
//        }
//
//        @Override
//        public int compareTo(ExtendedIntegers o) {
//            if (o instanceof NegativeNumber) {
//                return 1;
//            } else if (o instanceof PositiveNumber) {
//                return Integer.compare(value, ((PositiveNumber) o).value);
//            } else {
//                throw new IllegalStateException("Unknown ExtendedIntegers subtype: " + o);
//            }
//        }
//    }
//
//    private List<OrderedBox<Integer>> wrapInBoxes(List<Integer> args) {
//        List<OrderedBox<Integer>> list = new ArrayList<>();
//        for (Integer arg : args) {
//            list.add(new OrderedBox<>(arg));
//        }
//
//        return list;
//    }
//}
