import java.util.Scanner;
Bill
{
    public int billAmount;

    public void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter bill amount");
        int bill=s.nextInt();
        calculateBill(bill);
        System.out.println("are you regualar customer");
        boolean res=s.nextBoolean();
        if(res)
        {
            validate();
        }
        

        
    }

    public void calculateBill(int b)
    {
        
        billAmount=b*(100/8);
        System.out.println("8% discount "+billAmount);


    }
    public void validate()
    {
        System.out.println("enter coupen code");
        String cc=sc.next();
        for(int i=0;i<=cc.length()-1;i++)
        {
            char ch=cc.charAt(i);
            if((ch<='0')&&(ch>='9'))
            {

                

            }

        }
    }
}