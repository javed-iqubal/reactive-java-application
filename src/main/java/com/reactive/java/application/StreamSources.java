package com.reactive.java.application;

import java.util.stream.Stream;

/**
 *
 *  This class is a source of collection streams used in the exercises.
 *
 */
public class StreamSources {

    public static Stream<String> stringNumbersStream() {
        return Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
    }

    public static Stream<Integer> intNumbersStream() {
        return Stream.iterate(0, i -> i + 2)
                .limit(10);
    }

    public static Stream<Employee> employeeStream() {
        return Stream.of(
                new Employee(1, "Lionel", "Messi"),
                new Employee(2, "Cristiano", "Ronaldo"),
                new Employee(2, "Diego", "Maradona"),
                new Employee(4, "Zinedine", "Zidane"),
                new Employee(5, "Jürgen", "Klinsmann"),
                new Employee(6, "Gareth", "Bale")
        );
    }
}
