class Car
{
    public static String barnd="Honda";
    public String series;
    public int speed;
    public int time;

    public void setDetails(String a,int b,int c)
    {
        series=a;
        speed=b;
        time=c;
    }
    public void displayDetails()
    {
        System.out.println("series "+series);
        System.out.println("speed "+speed);
        System.out.println("time "+time);
        
    }

    public void distance()
    {
        System.out.println("distance "+speed*time);
    }


}

/**
 * MainCar
 */
class MainCar {
    public static void main(String[] args)
    {
        Car c1=new Car();
        Car c2=new Car();
        c1.setDetails("a1",60,1);
        c1.displayDetails();
        c1.distance();
        c1.setDetails("a2",90,2);
        c1.displayDetails();
        c1.distance();

    }
     A
}