class Circle
{
    public static double pie=3.14;
    public double radius;

    public void setRadius(double r)
    {
        if(r>=10&&r<=20)
        {
            radius=r;
            System.out.println("Radius "+radius);
        }
    }

    /* public void details()
    {
        System.out.println("pie value "+pie);
    } */

    public void findsurcomference()
    {
        System.out.println("surcumference of circle is "+(2*Circle.pie*radius));
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
        Circle c1=new Circle();
        Circle c2=new Circle();
        System.out.println("*********circle1 details**********");
        c1.setRadius(14.4);
        c1.findArea();
        c1.findDiameter();
        c1.findsurcomference();
        System.out.println("*********circle2 details**********");
        c2.setRadius(14.8);
        c2.findArea();
        c2.findDiameter();
        c2.findsurcomference();
        
    }
}