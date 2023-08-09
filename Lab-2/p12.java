import java.util.*;
public class p12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

		int sm=a[0];

		for(int i=1;i<n;i++){
			if(sm<a[i]){}
			else{
				sm=a[i];
			}
		}System.out.println("smallest number in this array :"+sm);
	}
}