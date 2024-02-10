package com.gotojava;

public class Hero implements HeroInterface {
    private String role;
    private int level;

    Hero(int level) {
        this.role = "Puncher";
        this.level = level;
    }

    @Override
    public void expIncreased(double experience) {
        
    }

    @Override
    public void addWeapon(Weapon name) {
    }

    @Override
    public String checkInfo() {
        String message = role + " with level " + level;
        return message;
    }

}
