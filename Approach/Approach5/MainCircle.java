class Circle
{
    private static double pie=3.14;
    private double radius;

    public Circle(double r)
    {
        if(r>=5&&r<=20)
        {
            radius=r;
            System.out.println("Radius "+radius);
        }
        else
        {
            System.out.println("invalid radius");
        }
    }

    /* public void details()
    {
        System.out.println("pie value "+pie);
    } */

    public void findsurcomference()
    {
        System.out.println("surcumference of circle is "+(2*pie*radius));
    }

    public void findDiameter()
    {
        System.out.println("Diameter of circle "+(2*radius));
    }

    public void findArea()
    {
        System.out.println("Area of circle "+pie*radius*radius);
    }
}

class MainCircle
{
    public static void main(String[] args) {
        
        public static void callm(Circle c1)
        {
            c1.findArea();
            c1.findDiameter();
            c1.findsurcomference();
        }

        callm(new Circle(2.3));


        



        /* Circle c1=new Circle(8.7);
        Circle c2=new Circle(6.2);
        System.out.println("*********circle1 details**********");
        
        c1.findArea();
        c1.findDiameter();
        c1.findsurcomference();
        System.out.println("*********circle2 details**********");
        
        c2.findArea();
        c2.findDiameter();
        c2.findsurcomference(); */
        
    }
}

/* var
var_met
encapsulation conditions

var met cons 

 */