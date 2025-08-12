package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World!");
            }
        };
        greeting2.sayHello();

        Calculator calculator = (int a, int b) -> {
            Random rand = new Random();
            int randomNumber = rand.nextInt(50);
            return a * b + randomNumber;
        };

        System.out.println(calculator.calculate(5, 6));
    }
}