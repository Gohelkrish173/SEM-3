import java.util.*;

class Searching{
    
    void BinaryS(int[] A,int n,int X){
        int l=0;
        int r=n-1;
        int index = n+1;

        Arrays.sort(A);

        while(l<=r){
            int m = l+ ((r-1)/2);

            if(A[m] == X){
                index = m;
            }
            
            if(A[m] < X){
                l=m+1;
            }

            else{
                r=m-1;
            }
        }
        
        if(index < n){
            System.out.println("index : "+index);
        }
        else{
            System.out.println("Invalid Input.");
        }

    }
}

public class Binary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size Of Array n : ");
        int n=sc.nextInt();

        int[] A = new int[n];

        System.out.println("Input's : ");

        for(int i = 0 ;i<n;i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Search Element");
        int X=sc.nextInt();

        Searching S = new Searching();

        S.BinaryS(A, n, X);
        sc.close();       
    }
}