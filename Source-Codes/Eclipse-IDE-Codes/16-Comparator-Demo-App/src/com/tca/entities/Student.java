package com.tca.entities;

public class Student 
{
    private int rno;
    private String name;
    private double per;
    
    public Student() 
    { 
    }

    public Student(int rno, String name, double per) 
    {
        this.rno = rno;
        this.name = name;
        this.per = per;
    }
    
    public int getRno()
    {
        return rno;
    }

    public String getName()
    {
        return name;
    }
    
    public double getPer()
    {
        return per;
    }

    public void display()
    {
        System.out.println("Roll Number : " +  rno);
        System.out.println("Name        : " +  name);
        System.out.println("Percentage  : " + per );
    }

    @Override
    public String toString() 
    {
        return "[" + rno + "," + name + "," + per + "]";  // [ 101,AAA,60]
    }
}

