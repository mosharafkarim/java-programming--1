package assisgment;
import java.util.*;

public class Circle {
	private double radius=1.0;
	private String color="red";
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius=radius;
		
	}
	public double getValue() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of radius");
		double radius=sc.nextDouble();
		return radius;
	}
	public double getArea() {
		double area=(4*3.14*radius)/3;
		return area;
	}
	public static void main(String args[]) {
		Circle crc=new Circle();
		crc.getValue();
		crc.getArea();
		
	}
}
