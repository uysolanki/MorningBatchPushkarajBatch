package day14misc;

public class Shape {					//function overloading
	
	public double area(int radius) //A     area(5)
	{
		return Math.PI*radius*radius;
	}
	
	public int area(int length,int breadth) //B area(5,10)
	{
		return length*breadth;
	}
	

}
// Following does not impact overloading
//1. Access specefier 
//2 Return Type
//3. Formal paramter names

//Following impact overloading
//1. parameter datatypes
//2 parameter count
