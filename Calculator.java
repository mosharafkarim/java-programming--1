package assisgment;
import java.util.*;

public class Calculator {
	
	 interface caloperation{
		int operation(int a,int b);
	}
	public void addition() {
		caloperation add=(a,b)->a+b;
		System.out.println("Additon " + add.operation(10,20));
	}
	public void  differnce() {
		caloperation diff=(a,b)->{
			if(a>b) {
				return(a-b);
			}
			else
			{
				return(b-a);
			}
		};
		System.out.println("Differnce "+diff.operation(10,20));
	}
	public void multiply() {
		caloperation mul=(a,b)->a*b;
		System.out.println("Multiplication " + mul.operation(10,20));
	}
	public void safeDivision() {
		caloperation div=(a,b)->a/b;
		System.out.println("Division " + div.operation(10,20));
	}
	
	public static void main(String args[]) {
		Calculator cal= new Calculator();
		
		cal.addition();
		cal.differnce();
		cal.multiply();
		cal.safeDivision();
	}
}
