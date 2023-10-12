import java.util.*;

class Sorting{
    int n = 0;
    void swap(int A[],int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    int partition(int A[],int low,int high){
        int pivot = A[high];
        int j = low - 1;

        for(int k = low ; k<= high -1;k++){
            if(A[k] < pivot){
                j++;
                swap(A,j,k);
            }
        }
        swap(A,j+1,high);
        return j+1;
    }

    void QuickS(int[] A,int low,int high){
        if(low < high){
        int pi = partition(A,low,high);

        QuickS(A,low,pi-1);
        QuickS(A,pi+1,high);
        }
    }

    void PrintQ(int A[]){
        System.out.println("Output's : ");
        for(int m=0;m<A.length;m++){
            System.out.println(A[m]+",");
        }
    }
    
}

public class Quick{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size Of Array n : ");
        int n = sc.nextInt();

        int A[] = new int[n];

        System.out.println("Input's : ");
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }

        Sorting S = new Sorting();

        S.QuickS(A,0,n-1);
        S.PrintQ(A);
        sc.close();       
    }
}