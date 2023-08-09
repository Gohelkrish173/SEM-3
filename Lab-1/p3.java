import java.util.*;

public class p3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String x=new String();
		System.out.println("a:");
		x=sc.nextLine();

		if(x.charAt(0)=='a' || x.charAt(0)=='e' || x.charAt(0)=='i' || x.charAt(0)=='o' || x.charAt(0)=='u'){
			System.out.println("given char. is vowel");
		}
		else{
			System.out.println("given char. is console");	
		}
	}
}