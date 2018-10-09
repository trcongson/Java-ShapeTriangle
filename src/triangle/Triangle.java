package triangle;

import java.util.Scanner;

public class Triangle extends Shape{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private double p = (side1 + side2 + side3)/2;

    public Triangle(){}

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài 3 cạnh của tam giác: ");
        this.side1 = side1;
        side1 = sc.nextDouble();
        this.side2 = side2;
        side2 = sc.nextDouble();
        this.side3 = side3;
        side3 = sc.nextDouble();
    }

    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return this.side2;
    }

    public double getSide3(){
        return this.side3;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getPerimeter(){
        return p;
    }

    public double getArea(){
        return Math.sqrt(p*(p - side1)*(p- side2)*(p- side3));
    }

    @Override
    public String toString(){
        return "Triangle has perimeter: " + getPerimeter() + " and area: " + getArea() + super.toString();
    }
}
