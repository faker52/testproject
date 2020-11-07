package com.example.learnlisit;

public class Person {

    private String name;

    private int Imageid;

    public Person(String name,int Imageid){
        this.Imageid=Imageid;
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public int getImageid(){
        return Imageid;
    }
}
