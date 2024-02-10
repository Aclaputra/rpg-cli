package com.gotojava;

public class Hero implements HeroInterface {
    private String role;
    private int level;
    private double experience;

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
        System.out.println("You reached Level " + experience);
    }

    @Override
    public void addWeapon(Weapon name) {

    }

    @Override
    public String checkInfo() {
        return role + " with level " + level;
    }

}
