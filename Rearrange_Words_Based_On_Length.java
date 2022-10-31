public class Rearrange_Words_Based_On_Length 
{
    public static void main(String[] args)
    {
        String s = "java python c c++ javascript vb swift";
        String ans=rearrange(s);
        System.out.println(ans);
    }
    
    static String rearrange(String s)
    {
        String a[] = s.split(" ");
        bubblesort(a);
        
        String ans="";
        for(int i=0;i<a.length;i++)
        {
            ans=ans+a[i]+" ";
        }
        
        return ans;
    }
    
    static void bubblesort(String a[])
    {
        int i,j;
        String temp;
        
        for(i=0; i<=a.length-2; i++)
        {
            for(j=0;j<=a.length-2-i;j++)
            {
                // compare length of 2 strings and swap   
                if( a[j].length() > a[j+1].length() )   
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
