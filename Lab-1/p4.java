import java.util.*;
public class p4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=1;

		for(int i=n;i>0;i--){
			ans=ans*i;
		}
		System.out.println(n+"!="+ans);
	}
}