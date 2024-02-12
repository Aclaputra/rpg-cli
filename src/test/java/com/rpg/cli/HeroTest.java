package com.rpg.cli;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HeroTest {
    private static Hero firstHero, secondHero;

    @BeforeAll
    static void beforeClass() {
        firstHero = new Hero(1);
        secondHero = new Hero(1);
    }

    @Test
    void TestHeroInfo() {
        String info = firstHero.checkInfo();
        Assertions.assertEquals("Puncher with level 1", info);
    }

    @Test
    void testHeroLevelUp() {
        secondHero.expIncreased(110);

        String info = secondHero.checkInfo();
        Assertions.assertEquals("Puncher with level 6", info);
    }

    
    
    
}
