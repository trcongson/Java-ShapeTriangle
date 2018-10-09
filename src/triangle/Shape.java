package triangle;

import java.util.Scanner;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape(){}

    public Shape(String color, boolean filled){
        Scanner sc = new Scanner(System.in);
        this.color = color;
        color = sc.nextLine();
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "A Shape with color" + getColor() + "and" + (isFilled() ? "filled" : "not filled");
    }
}

