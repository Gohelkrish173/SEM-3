import java.util.*;
public class perfect{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n:");
		int n=sc.nextInt();
		int a=0;

		for(int i=2;i<n;i++){
			if(n%i==0){
				a=a+i;
			}
		}
		if(a==n){
			System.out.println("given number is perfect");
		}
		else{
			System.out.println("given number is non-perfect");	
		}
	}
}