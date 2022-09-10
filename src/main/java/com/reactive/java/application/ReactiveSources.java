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

    public static Flux<Employee> employeeFlux() {
        return Flux.just(
                new Employee(1, "Lionel", "Messi"),
                new Employee(2, "Cristiano", "Ronaldo"),
                new Employee(2, "Diego", "Maradona"),
                new Employee(4, "Zinedine", "Zidane"),
                new Employee(5, "Jürgen", "Klinsmann"),
                new Employee(6, "Gareth", "Bale")
        ).delayElements(Duration.ofSeconds(1));
    }

    public static Mono<Employee> employeeMono() {
        return Mono.just(
                new Employee(1, "Lionel", "Messi")
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
