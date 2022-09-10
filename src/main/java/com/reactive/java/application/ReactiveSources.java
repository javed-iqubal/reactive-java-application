package com.reactive.java.application;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 *
 *  This class is a source of reactive streams used in the exercises.
 *
 */

public class ReactiveSources {

    public static Flux<String> stringNumbersFlux() {
        return Flux.just("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
                .delayElements(Duration.ofSeconds(1));
    }

    public static Flux<Integer> intNumbersFlux() {
        return Flux
                .range(1, 10)
                .delayElements(Duration.ofSeconds(1));
    }

    public static Flux<Integer> intNumbersFluxWithException() {
        return Flux
                .range(1, 10)
                .delayElements(Duration.ofSeconds(1))
                .map(e -> {
                    if (e == 5) throw new RuntimeException("An error happened in the flux");
                    return e;
                });
    }

    public static Mono<Integer> intNumberMono() {
        return Mono.just(42)
                .delayElement(Duration.ofSeconds(1));
    }

    public static Flux<Player> playerFlux() {
        return Flux.just(
                new Player(1, "Cristiano", "Ronaldo"),
                new Player(2, "Lionel", "Messi"),
                new Player(2, "Diego", "Maradona"),
                new Player(3, "Neymar", "Santos"),
                new Player(3,"Kylian","Mbappé"),
                new Player(4, "Zinedine", "Zidane"),
                new Player(5, "Jürgen", "Klinsmann"),
                new Player(6, "Gareth", "Bale"),
                new Player(6, "Edison", "Nascimento")

        ).delayElements(Duration.ofSeconds(1));
    }

    public static Mono<Player> playerMono() {
        return Mono.just(
                new Player(2, "Cristiano", "Ronaldo")
                ).delayElement(Duration.ofSeconds(1));

    }

    public static Flux<String> nonResponsiveFlux() {
        return Flux.never();
    }

    public static Mono<String> nonResponsiveMono() {
        return Mono.never();
    }

    public static Flux<Integer> intNumbersFluxWithRepeat() {
        return Flux
                .just(1, 2, 1, 1, 3, 2, 4, 5, 1)
                .delayElements(Duration.ofSeconds(1));
    }
}
