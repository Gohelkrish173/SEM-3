import java.util.*;

class Sorting{
    
    void InsertionS(int[] A,int n){
        int key=0;
        int shift = 0;

        for(int j=1;j<n;j++){
            key = A[j];
            int k = j-1;

            while(k >= 0 && A[k] > key){
                A[k+1] =A[k];
                k = k-1;
                shift = shift +1;
            }
            A[k+1] = key;
        }

        System.out.println("Output :-");

        for(int m=0;m<n;m++){
            System.out.print(A[m] + ",");    
        }
        System.out.println("\nShift :- "+shift);
    }
}

public class Insertion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Size Of Array n : ");
        int n = sc.nextInt();

        int A[] = new int[n];
        
        System.out.println("Input's :- ");
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }

        Sorting S = new Sorting();

        S.InsertionS(A, n);  
        sc.close();     
    }
}