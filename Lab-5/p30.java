import java.util.*;

public class p30{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String x=sc.nextLine();
        String x1=x+"  ";
        char[] y=new char[100];
        int AC=0,BC=0;
        int x2=0;
        int i=-1;
        
        try{
        while(x2!=1){
            i++;
            y[i]=x1.charAt(i);

            if(y[i]==' '){
                x2=1;
                break;
            }
            else if(y[i]=='a' || y[i]=='A'){
                AC=AC+1;
            }
        }
        
        x2=0;
        while(x2!=1){
            i--;
            
            if(y[i]=='a'){
                x2=1;
                break;
            }
            else if(y[i]=='b' || y[i]=='B'){
                BC=BC+1;
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("A:"+AC+",B:"+BC);
        if(BC==AC){
            System.out.println("Number of a is equals to Number of b");
        }
        else{System.out.println("Number of a is Not-equals to Number of b");}
    }
}