import java.util.*;

class Sorting{
    int temp = 0;
    void SelectionS(int[] A,int n){

        for(int j=0;j<n;j++){
            int minind =j;

            for(int k=j+1;k<n-1;k++){
                if(A[k] < A[minind]){
                    minind = k;
                }
            }
                temp = A[minind];
                A[minind] = A[j];
                A[j] = temp;
            System.out.print(A[j]+",");
        }
    }
}

public class Selection{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Size Of Array :");
        int n=sc.nextInt();

        int A[] = new int[n];

        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }

        Sorting S=new Sorting();

        S.SelectionS(A, n);
        sc.close();

    }
}