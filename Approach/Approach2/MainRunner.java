class Runner
{
    public String name;
    public String type;
    public int distance;
    public String unit;

    public void setDetails(String a,String b,int c,String d)
    {
        name=a;
        type=b;
        distance=c;
        unit=d;
    }
    public void display()
    {
        System.out.println("name "+name);
        System.out.println("type "+type);
        System.out.println("distance "+distance);
        System.out.println("units "+unit);
    }

    public void convert()
    {
        if(unit.equals("m"))
        {
            double km=(1000/distance);                                           
            System.out.println(km+" KM");
        }
        else
        {
            double m=(distance*1000);
            System.out.println(m+" meters");
        }
        
    }

}

/**
 * MainRunner
 */
class MainRunner {

    public static void main(String[] args)
    {
        Runner r=new Runner();
        r.setDetails("ravi", "marathon",20,"km");
        r.display();
        r.convert();
    }

    
}