import java.util.*;
public class p9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("n:");
		int n=sc.nextInt();
		int[] a=new int[n];

		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			System.out.println(a[i]);
		}
	}
}