import java.util.*;

public class p13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("n:");
        int n=sc.nextInt();
        int[] a=new int[n];
        int k=0;

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=n-1;j>k;j--){
                if(a[i]==a[j]){
                    System.out.println("array is contain duplicate values at index:"+j+"="+i);
                }
            }
            k=k+1;
        }
    }
}