import java.util.*;
public class p11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("n:");
		Double n=sc.nextDouble();
		Double x=1.0;

		for(int i=1;i<=n;i++){
			x=x+i;
		}
		Double average=(x/n);
		System.out.println("avg. of first n number :"+ average);
		sc.close();
	}
}
