class Phone
{
    public void on(double batteryPercentage,boolean power)
    {
        System.out.println("battery_percentage is "+batteryPercentage);
        System.out.println("power"+power);
    }

    public char chargin(char c)
    {
        System.out.println("cahrging..");
        return c;
    }

    public static void take_Phone()
    {
        System.out.println("take_phone");
        Phone p1=new Phone();
        p1.on(54.4,true);
        System.out.println("cahrging "+p1.chargin('y'));
    }

    public static void main(String[] args)
    {
        take_Phone();
    }


}
