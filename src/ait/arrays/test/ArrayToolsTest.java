package ait.arrays.test;

import ait.arrays.utils.ArrayTools;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
    }

    @org.junit.jupiter.api.Test
    void printArray() {
        System.out.println("===============testPrintArray============");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void search() {
        System.out.println("===============testSearch============");
        int index = ArrayTools.search(arrStr, "four");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrStr, "six");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 4);
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 6);
        System.out.println("index = " + index);
    }

    @Test
    void testFindByPredicate() {
        System.out.println("===============testFindByPredicate============");
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return false;
//            }
//        };
//        Predicate<Integer> predicate =n->n<5;
        Integer num = ArrayTools.findByPredicate(arrNum, n -> n < 5);
        System.out.println(num);
        num = ArrayTools.findByPredicate(arrNum, n -> n % 5 == 0);
        System.out.println(num);
        String str = ArrayTools.findByPredicate(arrStr, s -> s.length() == 4);
        System.out.println(str);
    }

    @Test
    void testBubbleSort() {
        System.out.println("===============testBubbleSort============");
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testBubbleSortComparator() {
        System.out.println("===============testBubbleSort============");
        ArrayTools.bubbleSort(arrNum, (n1, n2) -> n2 - n1);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr,(s1,s2)->s1.length()-s2.length());
        ArrayTools.printArray(arrStr);
    }
}