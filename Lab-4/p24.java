import java.util.*;

class Student_Detail{
	int enrno;
	String name;
	int sem;
	Double cpi;

	Student_Detail(){
		Scanner sc=new Scanner(System.in);
	 enrno=sc.nextInt();
	 sc.nextLine();	
 name=sc.nextLine();
 sem=sc.nextInt();
 cpi=sc.nextDouble();
	}

	Student_Detail(int enrno,String name,int sem,Double cpi){
		this.enrno=enrno;
		this.name=name;
		this.sem=sem;
		this.cpi=cpi;		
	}

	public void display(){
		System.out.println("ENRNO:"+enrno);
		System.out.println("Name:"+name);
		System.out.println("SEM:"+sem);
		System.out.println("CPI:"+cpi);
	}
}

public class p24{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("n:");		
	int n=sc.nextInt();

	Student_Detail[] s=new Student_Detail[5];
		for(int i=0;i<n;i++){
		s[i]=new Student_Detail();	
		}
		for(int i=0;i<n;i++){
			System.out.println("Student-"+(i+1));
			s[i].display();
		}
	}
}