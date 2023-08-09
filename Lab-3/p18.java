import java.util.*;
public class p18 
{
    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
        int[] arr={4,3,5,7,9,1,2};
        int n=arr.length;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }    
        for(int i:arr)
        {
            System.out.println(i);
        }    
        System.out.println("Enter value number");
        int j=jt.nextInt();
        int t=0;
        for(int i=0;i<n-1;i++)
        {
           if(arr[i]<j)
           {
                t=i+1;
           }
        //    else if(arr[i]!=j)
        //    {
        //         System.out.println("not found");
        //         return ;
        //    }
        }   
        for(int i=0;i<n-1;i++)
        {
           if(i>=t)
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
