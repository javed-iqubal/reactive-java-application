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

    public static Stream<Player> playerStream() {
        return Stream.of(
                new Player(1, "Cristiano", "Ronaldo"),
                new Player(2, "Lionel", "Messi"),
                new Player(2, "Diego", "Maradona"),
                new Player(3, "Neymar", "Santos"),
                new Player(3,"Kylian","Mbappé"),
                new Player(4, "Zinedine", "Zidane"),
                new Player(5, "Jürgen", "Klinsmann"),
                new Player(6, "Gareth", "Bale"),
                new Player(6, "Edison", "Nascimento")
        );
    }
}
