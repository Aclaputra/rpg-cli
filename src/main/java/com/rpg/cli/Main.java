package com.rpg.cli;

interface MainInterface {
    String hello(String name);
}
public class Main implements MainInterface {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}