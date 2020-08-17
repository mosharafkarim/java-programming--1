package assisgment;
import java.util.*;

public class Employee {
	String name;
	int yoj;
	float salary;
	String address;
	
	public void getInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of employee ");
		name=sc.next();
		System.out.println("Enter the year of joining  of employee ");
		yoj=sc.nextInt();
		System.out.println("Enter the salry of employee ");
		salary=sc.nextFloat();
		System.out.println("Enter the address of employee ");
		address=sc.next();
	}
	public void display() {
		System.out.println("Name    year of joining       Address");
		System.out.println( name           + yoj                 +     address);
	}
	public static void main(String args[]) {
		Employee e[]=new Employee[3];
		for(int i=0;i<3;i++) {
			e[i]=new Employee();
			e[i].getInput();
		}
		for(int i=0;i<3;i++) {
			e[i].display();
		}
	}
}
