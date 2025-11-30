package com.tca.geometry;

public class Cylinder implements Shape
{
    private double radius;
    private double height;

    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }

    public void printArea() // 2πrh+2πr2 
    {
        double ans = (2*Shape.PI*radius*height) + (2*Shape.PI*radius*radius);
        System.out.println("Area of Cylinder : " + ans);
    }
}
