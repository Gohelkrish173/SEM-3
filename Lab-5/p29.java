import java.util.*;

public class p29{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String x=sc.nextLine();
        String x1=x+"  ";
        char[] y=new char[100];
        String z=new String();
        char[] s=new char[100];
        int n=x1.length();
        int i=0,x2=0;

        try{
        while(x2!=1){
            i++;
            y[i]=x1.charAt(i-1);
            s[0]='c';
            if(y[i]=='c'){
                z=z+y[i];
                x2=1;
                break;
            }
            else{
                s[i]=y[i];
                z=z+y[i];
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
        x2=0;
        while(x2!=1){
            i--;
            if(i==0){
                x2=1;
                break;
            }
            else{
                z=z+s[i];
            }
            System.out.println(z);
        }
        
        if(x.equals(z)){
            System.out.println("given String is Recognized.");
        }
        else{
            System.out.println("given String is Not-Recognized.");
        }
    }
}