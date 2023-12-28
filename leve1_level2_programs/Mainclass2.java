class Charging
{
    public static boolean underCharge()
    {
        return true;
    }
    public static char chargingOrNot()
    {
        return 'y';
    }

    public static void check(boolean b,char c)
    {
        System.out.println("charging "+b);
        System.out.println("yesorno "+c);
    }
}

class Phone
{
    public void mobile()
    {
        /* boolean a=Charging.underCharge();
        char b= Charging.chargingOrNot(); */
        Charging.check(Charging.underCharge(),Charging.chargingOrNot());

    }

}

class Mainclass2
{
    public static void main(String[] args)
    {
        // Phone p=new Phone();
        // p.mobile();

        new Phone().mobile();
    }
}