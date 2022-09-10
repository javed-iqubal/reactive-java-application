package com.reactive.java.application;

import java.io.IOException;

public class Workout02 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().filter(e->e%2==0)
                .collectList().subscribe(System.out::println);

        ReactiveSources.intNumbersFlux().filter(e->e%2==1)
                .subscribe(System.out::println);

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
