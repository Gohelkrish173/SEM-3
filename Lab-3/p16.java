import java.util.*;
public class p16 
{
    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
        System.out.println("How many number you enter");
        int n=jt.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=jt.nextInt();
        }
        System.out.println("Enter index number");
        int j=jt.nextInt();
        for(int i=0;i<n-1;i++)
        {
           if(i>=j)
           {
                arr[i]=arr[i+1];
           }
        }    
        for(int i=0;i<n-1;i++)
        {
            System.out.println(arr[i]);
        }
    }    
}
