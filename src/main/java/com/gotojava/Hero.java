package com.gotojava;

public class Hero implements HeroInterface {
    private String role;
    private int level;
    private double experience;
    private Weapon weapon;

    Hero(int level) {
        this.role = "Puncher";
        this.level = level;
    }

    @Override
    public void expIncreased(double experience) {
        this.experience += experience;
        if (this.experience >= 100) {
            level++;
            this.experience = 0;
            System.out.println("Hero Leveled up to Level " + level);
            expIncreased(experience -= 100);
        }
        System.out.println("You reached Level " + level);
    }

    // TODO: check address newWeapon sama dengan attribute weapon class
    @Override
    public void addWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

    @Override
    public String checkInfo() {
        return role + " with level " + level;
    }

}
