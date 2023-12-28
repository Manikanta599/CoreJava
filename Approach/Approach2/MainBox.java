class Box
{
    public static String color="red";
    public double length;
    public double breadth;
    public double width;

    public void setDimensions(double a,double b,double c)
    {
        length=a;
        breadth=b;
        width=c;
    }

    public void displayDimesions()
    {
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
        Box b1=new Box();
        b1.setDimensions(4.4, 3.2, 7.2);
        b1.displayDimesions();
        b1.findVolume();

        Box b2=new Box();
        b2.setDimensions(4.6, 6.2, 8.2);
        b2.displayDimesions();
        b2.findVolume();
    }
     
}