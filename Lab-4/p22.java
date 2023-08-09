import java.util.*;

public class p22{
	public static void swap(int a,int b){
	int a1=a;
	int b1=b;
	int temp=1;

	System.out.println("a:"+a1);
	System.out.println("b:"+b1);
	temp=a1;
	a1=b1;
	b1=temp;
	System.out.println("new elements:");
	System.out.println("a:"+a1);
	System.out.println("b:"+b1);
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("a:");
		int a=sc.nextInt();
		System.out.print("b:");
		int b=sc.nextInt();

		swap(a,b);
	}
}