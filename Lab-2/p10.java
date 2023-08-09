import java.util.*;
public class p10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("m:");
		int m=sc.nextInt();
		System.out.println("n:");
		int n=sc.nextInt();
		int temp=0;
		for(int i=m;i<=n;i++){
			temp=temp+i;
		}
		System.out.println("sum of m to n :"+ temp);
	}
}