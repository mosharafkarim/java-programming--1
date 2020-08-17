package assisgment;
import java.util.*;

public class Triangle {
	
	public double  area(int a,int b,int c) {
		double result=(b*c)/2;
		return result;
	}
	
	
	
	public static void main(String args[]) {
		Triangle tr=new Triangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hypotenous of triangle");
		int h=sc.nextInt();
		System.out.println("Enter the base of triangle");
		int i=sc.nextInt();
		System.out.println("Enter the height of triangle");
		int j=sc.nextInt();
		double mk=tr.area(h,i,j);
		System.out.println("Area of the triangle is " + mk);
	}
}
