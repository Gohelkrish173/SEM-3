import java.util.*;
public class p7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n:");
		int n=sc.nextInt();
		System.out.print("Factors of n:");

		for(int i=2;i<n;i++){
			if(n%i==0){
				System.out.println(i+",");
			}
		}
		System.out.println("\b");
	}
}