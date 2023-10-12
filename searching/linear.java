import java.util.*;

public class linear{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter Size Of Array");
        int n=sc.nextInt();

        int A[] = new int[n];

        System.out.println("Input's :-");
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Find Element : -");
        int X=sc.nextInt();
        int index = n+1;

        for(int j=0;j<n;j++){
            if(X==A[j]){
                index = j;
                System.out.println("index = "+index);
            }
        }
        if(index > n ){
            System.out.println("invalid input");
        }
        sc.close();
    }
}