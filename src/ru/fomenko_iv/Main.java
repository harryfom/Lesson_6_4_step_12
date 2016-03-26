package ru.fomenko_iv;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

/*
Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.

Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:

minMaxConsumer.accept(min, max);

Если стрим не содержит элементов, то вызовите

minMaxConsumer.accept(null, null);
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("6.4 Stream API – Шаг 12");
    }
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        // your implementation here
    }
}
