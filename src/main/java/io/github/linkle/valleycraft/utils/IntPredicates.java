package io.github.linkle.valleycraft.utils;

import java.util.function.IntPredicate;

public class IntPredicates {
    public static final IntPredicate TRUE = (a) -> true;
    public static final IntPredicate FALSE = (a) -> false;
    public static final IntPredicate EQUAL = (a) -> a == 0;
    public static final IntPredicate NOT = (a) -> a != 0;
    public static final IntPredicate GEATER = (a) -> a > 0;
    public static final IntPredicate LESS = (a) -> a < 0;
}
