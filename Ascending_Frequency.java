import java.util.*;

class CharCount implements Comparable<CharCount>
{
    char ch;
    int count;

    CharCount(char ch, int count) 
    {
        this.ch = ch;
        this.count = count;
    }

    @Override
    public int compareTo(CharCount o) 
    {
        return (this.count-o.count);
    }
}


public class Frequency_Of_Chars_In_Ascending_Order 
{
    public static void main(String[] args) 
    {
        String s="hello world how are you";
        printFrequencyAscending(s);
    }
    
    static void printFrequencyAscending(String s)
    {
        int i,j;
        char ch;
        
        ArrayList<CharCount> al=new ArrayList<>();
        
        for(i=0;i<s.length();i++)
        {
            ch = s.charAt(i);
            
            // find if ch is already in list or not
            boolean flag=false;
            for(j=0;j<al.size();j++)
            {
                if(ch==al.get(j).ch)
                {
                    al.get(j).count++;
                    flag=true;
                }
            }
            
            if(flag==false)
            {
                al.add(new CharCount(ch, 1));
            }
        }
        
        // Sort based on Frequency
        Collections.sort(al);
        
        for(CharCount obj: al)
        {
            System.out.println(obj.ch+" "+obj.count);
        }
    }
}
