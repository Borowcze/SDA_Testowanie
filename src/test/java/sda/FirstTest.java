package sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstTest {

        @Test
    void helloTest(){
            // arramge
            final var greeter = new Greeter();

            // act
            final var msg = greeter.hello();

            // assert
            Assertions.assertFalse(new Greeter().hello().isEmpty());

    }
    private static class Greeter {
            private String hello(){
                return "Hello";
            }
    }
}
