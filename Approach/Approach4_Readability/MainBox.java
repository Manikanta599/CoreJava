class Box
{
    private static String color="red";
    private double length;
    private double breadth;
    private double width;



    public Box(double length,double breadth)
    {
        if(length>=3 && length<=9)
        {
            this.length=length;
        }
        else
        {
            System.out.println("Invaid Length");
        }

        if(breadth>=2&&breadth<=5)
        {
            this.breadth=breadth;
        }
        else
        {
            System.out.println("Invaid Breadth");
            
        }

        
    }

    public  Box(double length,double breadth,double width)
    {
        
        this(length,breadth);
        if(width>=4&&width<=10)
        {
            this.width=width;
        }
        else
        {
            System.out.println("Invaid width");
        }
    }

    

    public void displayDimesions()
    {
        System.out.println("colour "+color);
        System.out.println("length "+length);
        System.out.println("breadth "+breadth);
        System.out.println("width "+width);
    }

    public void findVolume()
    {
        System.out.println("volume of box "+(length*breadth*width));
    }

}

/**
 * MainBox
 */
class MainBox
{
    public static void main(String[] args)
    {
        Box b1=new Box(4.4, 3.2, 7.2);
        
        b1.displayDimesions();
        b1.findVolume();

        Box b2=new Box(4.6, 6.2, 8.2);
        
        b2.displayDimesions();
        b2.findVolume();
        
    }
     
}