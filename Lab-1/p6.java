import java.util.*;
public class p6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int p=sc.nextInt();
		int temp=1;

		for(int i=0;i<p;i++){
			temp=temp*b;
		}
		System.out.println(temp);
	}
}