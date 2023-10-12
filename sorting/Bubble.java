import java.util.*;

class Sorting{
    int temp = 0;

    void BubbleS(int[] A,int n){
        
        for(int j=n-1;j>=0;j--){

            for(int k=0;k<j;k++){

                if(A[k]>A[k+1]){

                    temp = A[k+1];

                    A[k+1]=A[k];

                    A[k]=temp;
                }
            }   
        }

        for(int m=0;m<n;m++){
            System.out.print(A[m]+",");
        }
    }
}

public class Bubble{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Array Size n :");
        int n=sc.nextInt();

        int A[]=new int[n];

        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }

        Sorting S = new Sorting();

        S.BubbleS(A, n);
        sc.close();       
    }
}