package ru.fomenko_iv;

import java.util.Comparator;

/**
 * Created by dns on 26.03.2016.
 */
public class IntComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer v1, Integer v2) {
        return v1 < v2 ? -1 : v1 > v2 ? +1 : 0;
    }
}
