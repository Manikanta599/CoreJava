import java.util.Scanner;
class Email
{
    public String password;

    public Email(String s)
    {
        password=s;
        //System.out.println("yes");
    }

    public  void check()
    {
        
        int acount=0;
        int dcount=0;
        int scount=0;
        if(password.length()>=8)
        {
        for(int i=0;i<password.length();i++)
        {
            char ch=password.charAt(i);
            
            if(Character.isAlphabetic(ch))
            {
                acount++;
            }
            else if(Character.isDigit(ch))
            {
                dcount++;
            }
            else
            {
                scount++;
            }
        }

        if(acount>=1 && dcount>=1 && scount>=1)
        {
            System.out.println("Password Accepted");
            
        }
        else
        {
            System.out.println("Invalid Password");
            
        }
    }
    else
    {
        System.out.println("Invalid Password");
    }
    }
}

/**
 * MainEmail
 */
class MainEmail
{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password");
        String s=sc.next();
        Email e=new Email(s);
        
            
            e.check();
        
    }
}
        
        
        

    

    
