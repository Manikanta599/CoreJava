class Box
{
    private static String color="red";
    private double length;
    private double breadth;
    private double width;

    public  Box(double a,double b,double c)
    {
        if(a>=3 && a<=9)
        {
            length=a;
        }
        else
        {
            System.out.println("Invaid Length");
        }

        if(b>=2&&b<=5)
        {
            breadth=b;
        }
        else
        {
            System.out.println("Invaid Breadth");
            
        }

        if(c>=4&&c<=10)
        {
            width=c;
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