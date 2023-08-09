public class p11{
	public static void main(String[] args){
		int i=0,j=0,k=0,n=3;

		for(i=1;i<=4;i++){
			for(j=i;j<=3;j++){
				System.out.print(" ");
			}
			System.out.print("*"+"\n");
			for(k=1;k<=n;k++){
				if(n==7){
					break;
				}
				if(k%2==0){
					System.out.print(" ");
				}
				else{
					System.out.print("*"+" ");
				}

				n=n+2;
			}
		}
	}
}