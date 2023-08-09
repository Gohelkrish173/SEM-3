import java.util.*;
public class p8{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("n:");
	int n=sc.nextInt();
	int count=0;

	for(int i=2;i<n;i++){
		if(n%i==0){
			count=count+1;
			break;
			}	
		}
		if(count==1){
			System.out.println("given number is non-prime");
		}
		else{
			System.out.println("given number is prime");
			}
		}
	}
