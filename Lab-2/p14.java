import java.util.*;
public class p14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("n:");
        int n=sc.nextInt();
        int k=0;

        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("n1:");
        int n1=sc.nextInt();
        System.out.println("n2:");
        int n2=sc.nextInt();
    
        for(int i=0;i<n;i++){
                if(n1==a[i]){
                    System.out.println("index:"+i);
                    a[i]=n2;
                    System.out.println("a["+i+"] ="+a[i]);
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
            System.out.print("\b");
    }
}
