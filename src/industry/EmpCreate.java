package industry;

import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class EmpCreate {
	protected int Empid;
	private int EmpAge;
	private String EmpName;
	private String EmpRole;
	private String EmpEligibility;
	private int BasicSal;
	Scanner sc = new Scanner(System.in);
	ArrayList<String[]> EmployeeData = new ArrayList<String[]>(100);
	private boolean repeat;

	public ArrayList<String[]> PersonalDetails() throws CustomException1, IOException {
		File employeeDetails = new File("EmpDetails.txt");
		PrintWriter pw = new PrintWriter(new FileWriter(employeeDetails, true));

		System.out.println("Enter the Professional & Personal Details of Employee:");
		String[] Details = new String[6];

		for (int initial = 0; initial < Details.length; initial++) {
			
			try {
				if (initial == 0) {
					System.out.println("Enter the Employee_id:");
					Empid = sc.nextInt();
					if (Empid == 0) {
						throw new CustomException1("Employee id never be zero");
					}
					Details[initial] = Integer.toString(Empid);
				}
				
			}
				 catch(InputMismatchException ex){
	                    System.err.println("Invalid id please enter correct id."); 
	                    sc.next();
	                    continue; 
				}
			
			
			do {
			try {
				
			if (initial == 1) {
				System.out.println("Enter the Employee_age:");
				EmpAge = sc.nextInt();
				Details[initial] = Integer.toString(EmpAge);
				repeat=true;
			}
			}
			 catch(InputMismatchException ex){
                 System.err.println("Invalid salary please enter a decimal."); 
                 sc.next();
                 continue; 
			}
			}while(repeat==false);
				if (initial == 2) {
					System.out.println("Enter the Employee_name:");
					EmpName = sc.next();
					Details[initial] = EmpName;
					
				}
				
				if (initial == 3) {
					System.out.println("Enter the Designation:");
					EmpRole = sc.next();
					Details[initial] = EmpRole;
				}
				if (initial == 4) {
					System.out.println("Enter the Skills of Employee:");
					EmpEligibility = sc.next();
					Details[initial] = EmpEligibility;
				}
				do {
					try
					{
				if (initial == 5) {
					System.out.println("Enter the Salary of Employee:");
					BasicSal = sc.nextInt();
					Details[initial] = Integer.toString(BasicSal);
					repeat = false;
				}
					}
					catch(InputMismatchException ex){
	                    System.err.println("Invalid salary please enter a decimal."); 
	                    sc.next();
	                    continue;   
	                } 
				}while(repeat);
				EmployeeData.add(Details);
				System.out.println("Employee Details Sucessfully Completed");
				return EmployeeData;
		}
		return EmployeeData;
}
}