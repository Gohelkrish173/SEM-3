import java.util.*;

class Employee_Details{
	int emp_ID;
	String name;
	String designation;
	Double salary;

	Employee_Details(){
		salary=0.0;
		designation=null;
		name=null;
		emp_ID=0;
	}

	Employee_Details(int emp_ID,String name,String designation,Double salary){
		this.emp_ID=emp_ID;
		this.name=name;
		this.designation=designation;
		this.salary=salary;

		System.out.println("Employee_ID:"+emp_ID);
		System.out.println("Name:"+name);
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);
		System.out.println("");
	}
}

public class p23{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n:");
		int n=sc.nextInt();
		int e_id;
		String name;
		String design;
		Double salary;

		try{
		for(int i=0;i<n;i++){
			System.out.println("emp."+(i+1));
			System.out.print("empid:");
			e_id=sc.nextInt();
			System.out.print("name:");
			sc.nextLine();
			name=sc.nextLine();
			System.out.print("designation:");
			design=sc.nextLine();
			System.out.print("salary:");
			salary=sc.nextDouble();
			System.out.println("\n");
			Employee_Details e=new Employee_Details(e_id,name,design,salary);
		}
	}catch(Exception e){
		System.out.println(e);
	}
	}	
}