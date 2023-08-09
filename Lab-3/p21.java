import java.util.*;
public class p21 
{
    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
        int[][] a=new int[3][2];
        int[][] b=new int[2][3];
        int[][] c=new int[3][3];
        int sum=0;
        System.out.println("Enter the first martix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=jt.nextInt();
            }
        }
        System.out.println("Enter the second martix");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=jt.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<2;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
