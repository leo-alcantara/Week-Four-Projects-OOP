package se.lexicon;

public class Rectangle {

    double height;
    double width;

    public Rectangle(){

    }

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getArea(double height, double width){
        double area = height*width;
        System.out.println("The area of your rectangle is: " + area + " square centimeters.");
        return area;
    }

    }


