import java.util.*;
public class p20 
{
    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
        int[][] a=new int[2][2];
        int[][] b=new int[2][2];
        int[][] c=new int[2][2];
        System.out.println("Enter the first martix");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=jt.nextInt();
            }
        }
        System.out.println("Enter the second martix");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                b[i][j]=jt.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
       for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
