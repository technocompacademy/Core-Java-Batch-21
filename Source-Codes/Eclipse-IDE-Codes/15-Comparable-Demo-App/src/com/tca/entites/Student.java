package com.tca.entites;

public class Student implements Comparable<Student>
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

	public void setRno(int rno) 
	{
		this.rno = rno;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getPer() 
	{
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public void display()
	{
		System.out.println("Roll Number : " +  this.rno);
		System.out.println("Name        : " +  this.name);
		System.out.println("Percentage  : " +  this.per );
	}

	@Override
	public String toString() 
	{
		return "[" + rno + "," + name + "," + per + "]";  // [ 101,AAA,60]
	}

	@Override
	public int compareTo(Student ob2)        // ob1.compareTo(ob2)
	{
		/*
		Integer i1 = this.rno;
		Integer i2 = ob2.rno;
		return i1.compareTo(i2);
		
		*/
		/*
		Double d1 = this.per;
		Double d2 = ob2.per;
		return d1.compareTo(d2);  // 0, +ve , -ve
		*/	
		
		String s1 = this.name;
		String s2 = ob2.name;
		return s1.compareTo(s2);
		
		
	}
	
}






