package org.example;
public class character {
    private String name;
    private int age;
    private int health;
    private int attackdamage;

    character(String name,int age,int health,int attackdamage){
        this.name = name;
        this.age = age;
        this.health=health;
        this.attackdamage = attackdamage;
    }
    //getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getHealth(){
        return health;
    }
    public int getAttackdamage(){
        return attackdamage;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void setAttackdamage(int attackdamage){
        this.attackdamage=attackdamage;
    }
    //function
    public int attack(character hameed){
        health = health - attackdamage;
        return health;
    }

}
