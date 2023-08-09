import java.util.*;
public class p1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("r:");
		Double r=sc.nextDouble();
		Double pi=3.14;
		Double area=(pi)*(r)*r;
		System.out.println(area);
		sc.close();
	}
}