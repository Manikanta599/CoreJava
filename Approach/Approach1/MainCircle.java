class Circle
{
    public static double pie=3.14;
    public double r;
}

class MainCircle
{
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle();
        Circle c3=new Circle();
        c1.r=12.2;
        c2.r=19.9;
        c3.r=18.4;

        System.out.println("details of circle 1");
        System.out.println("pie value "+Circle.pie);
        System.out.println("radius "+c1.r+"Area "+(Circle.pie*c1.r*c1.r)+"surcomference "+(2*Circle.pie*c1.r)+"diameter"+(2*c1.r));
        System.out.println("**********************************************************************");
        System.out.println("details of circle 2");
        System.out.println("radius "+c2.r+"Area "+(Circle.pie*c2.r*c2.r)+"\nsurcomference "+(2*Circle.pie*c2.r)+"diameter"+(2*c2.r));
        System.out.println("**********************************************************************");
        System.out.println("details of circle 3");
        System.out.println("radius "+c3.r+"Area "+(Circle.pie*c3.r*c3.r)+"surcomference "+(2*Circle.pie*c3.r)+"diameter"+(2*c3.r));
        System.out.println("**********************************************************************");




    }
}