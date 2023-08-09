import java.util.*;
public class p15 {
    public static void main(String[] args) {
        Scanner jt=new Scanner(System.in);
        //Scanner jt=new Scanner(System.in);
        System.out.println("How many number you enter");
        int n=jt.nextInt();

        int[] arr=new int[n];
        int[] narr=new int[n+1];
        for(int i=0;i<n;i++)
        {
            arr[i]=jt.nextInt();
        }
        System.out.println("Enter index number");
        int j=jt.nextInt();
        System.out.println("Enter number");
        int t=jt.nextInt();
        for(int i=0;i<narr.length;i++)
        {
            if(i<j)
            {
                narr[i]=arr[i];
            }
            else if(i==j)
            {
                narr[i]=t;
            }
            else{
                narr[i]=arr[i-1];
            }
        }
         for(int i=0;i<narr.length;i++)
        {
            System.out.println(narr[i]);
        }
    }
}
