import java.lang.Character;
class Count
{
    String s;
    public void set(String a)
    {
        s=a;
    }
    public void countings()
    {
        int aCount=0;
        int dCount=0;
        int sCount=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(Character.isAlphabetic(ch))
            {
                aCount++;
            }
            else if(Character.isDigit(ch))
            {
                dCount++;

            }
            else
            {
                sCount++;
            }


        }
        System.out.println(aCount);
        System.out.println(dCount);
        System.out.println(sCount);

        
    }
}

/**
 * StrCount
 */
class StrCount {

    public static void main(String[] args)
    {
        Count c=new Count();
        c.set("11aa@@#");
        c.countings();
    }

    
}