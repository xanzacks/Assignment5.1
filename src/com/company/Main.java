package com.company;
//this is E9.13
import java.awt.*;
import java.lang.Object;
public class Main {

    static void checkBoundary(int width, int height) {//age checking
        if (width <= 0||height <= 0) {
            throw new ArithmeticException("Access denied - both of he width and height must be greater than 0");
        }
        else {
            System.out.println("Access granted");
        }
    }

    public static class BetterRectangle extends Rectangle{
        public BetterRectangle(int x, int y, int width, int height){
            checkBoundary(width, height);
            super.setLocation(x, y);
            super.setSize(width, height);
        }

        public int getPerimeter(){
            int Perimeter = 2 * (width + height);

            return 2 * (width + height);
        }

        public int getArea(){
            return width*height;
        }

    }

    public static void Trymethod(int x, int y, int width, int height){//other exception handling
        try{
            BetterRectangle obj1 = new BetterRectangle(x, y, width, height);
            System.out.println("The perimeter of the rectangle is " + obj1.getPerimeter());
            System.out.println("The area of the rectangle is " + obj1.getArea());
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }

    public static void main(String[] args) {
	// three cases
        Trymethod(0,0,1,1);
        Trymethod(0,0,-1,1);
        Trymethod(0,0,1,-1);
    }
}
