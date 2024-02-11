package com.rpg.cli;

public interface HeroInterface {
    /**
     * TODO: Hero User Story
     * 1. Hero can be created through level and name with default role "Puncher".
     * 2. Hero have Health increase by Hero level, Weapon (damage increase by weapon level).
     * {@link com.gotojava}
     * @see https://www.notion.so/Public-Notion-db81355967b641b6a6a5e852023573b1?pvs=4
     * @author Muhammad Acla - https://github.com/Aclaputra
     */
    void expIncreased(double experience);
    void addWeapon(Weapon name);
    String checkInfo();
}
