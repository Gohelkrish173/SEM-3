import java.util.*;
public class p17 
{
    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
        int[] arr={4,2,3};
        int[] narr=new int[arr.length+1];
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
        System.out.println("Enter number");
        int t=jt.nextInt();
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<t)
            {
              j=i+1;
            }
        }
        System.out.println();
        // System.out.println("Enter index number");
        // int j=jt.nextInt();
       
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
         for(int i:narr)
        {
            System.out.println(i);
        }
    }    
}
