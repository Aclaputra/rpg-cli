package com.gotojava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeroTest {

    @Test
    void testHeroInfo() {
        Hero hero = new Hero(1);
        String info = hero.checkInfo();
        Assertions.assertEquals("Puncher with level 1", info);
    }
    
}
