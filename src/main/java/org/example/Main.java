package org.example;
public class Main {
    public static void main(String[] args) {
        character shahul = new character("shahul",23,2000,300);
        character hameed = new character("hameed",24,1000,300);
        character u1 = new character("hello",23,430,2030);
        character u2  = new character("hello",23,400,200);
        System.out.println(shahul.getName());
        int attack3 = u1.attack(hameed);
        int attack1 = shahul.attack(hameed);
        int attack2 = hameed.attack(shahul);
        int attack4 = u2.attack(hameed);
        System.out.println("health: " + attack1);
        System.out.println("health: " + attack2);
        System.out.println("health: " + attack3);
        System.out.println("health: " + attack4);
        System.out.println(u1.getHealth());
        System.out.println();


        }
    }

