import java.util.*;

public class printmatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("verties:");
        int V=sc.nextInt();

        int A[][]=new int[V][V];

        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                A[i][j]=sc.nextInt();
                if(A[i][j]>1){
                    A[i][j]=sc.nextInt();                    
                }
            }
        }
        
        System.out.println("Graph of Matrix:-");
        for(int x1=0;x1<V;x1++){
            for(int x2=0;x2<V;x2++){

                System.out.print(A[x1][x2]);
            }
        System.out.println("");    
        }
    }
}