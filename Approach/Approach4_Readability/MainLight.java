class Light
{
    private String brandName;
    private double volts;
    private int rating;

    public Light(String brandName,double volts)
    {
        if(volts>=3.5 && volts<=12.2)
        {
            this.volts=volts;
        }
        else
        {
            System.out.println("invalid volts");
        }
        if(brandName.equalsIgnoreCase("wipro")||brandName.equalsIgnoreCase("philips")||brandName.equalsIgnoreCase("surya"))
        {
            this.brandName=brandName;
        }
        else
        {
            System.out.println("invalid brandname");
        }

        rating=getRating(brandName);
    }
    public int getRating(String brandName)
    {
       

        if(brandName.equalsIgnoreCase("wipro"))
        {
            return 4;
        }
        else if(brandName.equalsIgnoreCase("philips"))
        {
            return 5;
        }

        else if(brandName.equalsIgnoreCase("surya"))
        {
            return 3;
        }
        else
        {
            return 0;
        }
    }
    

    public void display()
    {
        System.out.println("brandName "+brandName);
        System.out.println("volts "+volts);
        System.out.println("rating "+rating);
    }

}

class MainLight {
    public static void main(String[] args)
    {
        Light light1=new Light("WIPRO",4.5);
        Light light2=new Light("philips", 8);
        light1.display();
        light2.display();
    }

    
}