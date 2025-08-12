package org.example;

@FunctionalInterface
public interface Greeting {
    void sayHello();
    // void sayGoodbye(); // -> not allowed because the annotation blocks it
}
