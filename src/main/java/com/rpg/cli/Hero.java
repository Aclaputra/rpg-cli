package com.rpg.cli;

public class Hero implements HeroInterface {
    private String role;
    private int level;
    private double experience;
    private Weapon weapon;

    public Hero(int level) {
        this.role = "Puncher";
        this.level = level;
    }

    // Hero will level up based on experience & fibonacci rule.
    public int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    @Override
    public void expIncreased(double experience) {
        this.experience += experience;
        if (this.experience >= 100) {
            level++;
            this.experience = 0;
            System.out.println("Hero Leveled up to Level " + level);
            expIncreased(experience -= fibonacci(level));
        }
        System.out.println("You reached Level " + level);
    }

    @Override
    public void addWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
        System.out.println("adding weapon");
    }

    @Override
    public String checkInfo() {
        return role + " with level " + level;
    }

}
