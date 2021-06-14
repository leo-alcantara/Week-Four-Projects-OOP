package se.lexicon;

import java.util.Scanner;

public class RectangleProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the height of your rectangle in centimeters.");
        double height = scanner.nextDouble();
        System.out.println("Please type the width of your rectangle in centimeters.");
        double width = scanner.nextDouble();

        Rectangle rectangle01 = new Rectangle(height, width);

        rectangle01.getArea(height, width);

        System.out.println(rectangle01.getHeight());
        System.out.println(rectangle01.getWidth());






    }
}
