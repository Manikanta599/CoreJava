class Car
{
    private static String barnd="Honda";
    private String series;
    private int speed;
    private int time;

    public Car(String series,int speed,int time)
    {
        this.series=series;
        if(b>=80&&b<=120)
        {
            speed=b;
        }
        else
        {
            System.out.println("invalid speed");
        }
        if(c>=1&&c<=10)
        {
            this.time=time;
        }
        else
        {
            System.out.println("invalid time");
        }
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
        Car c1=new Car("a1",90,1);
        Car c2=new Car("a2",90,2);
        
        c1.displayDetails();
        c1.distance();
        
        c2.displayDetails();
        c2.distance();

    }
     
}