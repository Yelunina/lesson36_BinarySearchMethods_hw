package ait.arrays.test;

import java.util.function.Predicate;

public class FivePredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer < 5;
    }
}
