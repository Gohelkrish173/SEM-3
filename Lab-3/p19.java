public class p19 
{
    //marge two array
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int alen=a.length;

        int blen=b.length;
        
        int[] c=new int[alen+blen];

        for(int i=0;i<alen;i++)
        {
            c[i]=a[i];
        }
        for(int i=alen;i<c.length;i++)
        {
            c[i]=b[i-alen];
        }
        for(int j:c)
        {
            System.out.println(j);
        }
    }    
}
