package Test;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		EmployeeInformation e=new EmployeeInformation();
		System.out.println("Enter employee id:");
		e.setEmpId(s.nextInt());
		System.out.println("Enter employee name:");
		e.setEmpName(s.next());
		System.out.println("Enter employee address:");
		e.setEmpAddress(s.next());
		System.out.println("Enter employee salary:");
		e.setEmpSal(s.nextDouble());
		System.out.println("Enter employee designation:");
		e.setEmpDesignation(s.next());
		EmployeeInformation e1=new EmployeeInformation(1,"Chandu","Visakhapatnam",50000,"Senior analyst");
		System.out.println(e);
		System.out.println(e1);
	}
	

}
