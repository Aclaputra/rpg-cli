package com.rpg.cli;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    void helloPersonTest() {
        Main main = new Main();
        Assertions.assertEquals(main.hello("Acla"), "Hello Acla");
    }

    @Test
    void testHelloWorld() {
        Main main = new Main();
        Assertions.assertEquals(main.hello("World"), "Hello World");
    }
}
