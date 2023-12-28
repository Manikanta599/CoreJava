class Car
{
    public static String barnd="Honda";
    public String series;
    public int year;
    public double milage;
    public int speed;
    public int time;

    public double distance(int s,int t)
    {
        return s*t;
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
        Car c3=new Car();
        Car c4=new Car();

        System.out.println("1st car details..");
        c1.series="Honda city";
        c1.year=2018;
        c1.milage=27.13;
        c1.speed=60;
        c1.time=2;
        System.out.println("Brand "+Car.barnd+"\n Series "+c1.series+"\nyear "+c1.year+"\n milage "+c1.milage+"\nspeed "+c1.speed+"\n time "+c1.time);
        System.out.println("Distance travalled "+c1.distance(c1.speed,c1.time));

        System.out.println("2nd car details..");
        c2.series="Honda WR-V";
        c2.year=2019;
        c2.milage=25.50;
        c2.speed=70;
        c2.time=1;
        System.out.println("Brand "+Car.barnd+"\n Series "+c2.series+"\nyear "+c2.year+"\n milage "+c2.milage+"\nspeed "+c2.speed+"\n time "+c2.time);
        System.out.println("Distance travalled "+c2.distance(c2.speed,c2.time));


        System.out.println("3rd car details..");
        c3.series="Honda Elevate";
        c3.year=2021;
        c3.milage=22.50;
        c3.speed=80;
        c3.time=2;
        System.out.println("Brand "+Car.barnd+"\n Series "+c3.series+"\nyear "+c3.year+"\n milage "+c3.milage+"\nspeed "+c3.speed+"\n time "+c3.time);
        System.out.println("Distance travalled "+c3.distance(c3.speed,c3.time));

        System.out.println("4th car details..");
        c4.series="Honda Amaze";
        c4.year=2022;
        c4.milage=18.50;
        c4.speed=90;
        c4.time=3;
        System.out.println("Brand "+Car.barnd+"\n Series "+c4.series+"\nyear "+c4.year+"\n milage "+c4.milage+"\nspeed "+c4.speed+"\n time "+c4.time);
        System.out.println("Distance travalled "+c4.distance(c4.speed,c4.time));






    }



     
}