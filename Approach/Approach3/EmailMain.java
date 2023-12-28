import java.util.Scanner;
class Email
{
    public String password;

    public void input()
    {
        System.out.println("Enter password: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        PasswordValidation(s);

    }

    public void PasswordValidation(String str)
    {
        int aCount=0;
        int dCount=0;
        int sCount=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            char ch=str.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch<='a'&&ch>='z'))
            {
                aCount++;
            }
            else if(ch>='0'&&ch<='9')
            {
                dCount++;
            }
            else
            {
                sCount++;
            }

        }
        if((str.length()>=8)&&(aCount>=1)&&(dCount>=1)&&(sCount>=1))
        {
            password=str;
            System.out.println("Password Accepted");
        }
        else
        {
            System.out.println("invalid Password");
        }
    }

}

/**
 * EmailMain
 */
class EmailMain {
    public static void main(String[] args)
    {
        Email e=new Email();
        e.input();
    }

    
}