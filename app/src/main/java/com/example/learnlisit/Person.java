package com.example.learnlisit;

public class Person {

    private String name;

    private int Imageid;

    private String Text;

    public Person(String name,int Imageid,String text){
        this.Imageid=Imageid;
        this.name=name;
        this.Text=text;
    }

    public String getName(){
        return name;
    }
    public int getImageid(){
        return Imageid;
    }
    public String getText(){return Text;}
}
