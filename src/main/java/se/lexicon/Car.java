package se.lexicon;

public class Car {

    int id;
    int year;
    String model;
    String color;
    int motorSize;

    public Car(int id, int year, String model, String color, int motorSize){
        this.id = id;
        this.year = year;
        this.model = model;
        this.color = color;
        this.motorSize = motorSize;
    }

    public String drive(){
        System.out.println(model + " with motor " + motorSize + " can drive now.");
        return model;
    }




}
