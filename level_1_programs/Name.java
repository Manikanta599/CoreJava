public class Name {
    public static String getName(String n)
    {
        return n;

    }

    public void setName()
    {
        System.out.println("My name is "+getName("Manikanta"));
    }

    public static void main(String[] args)
    {
        Name n1=new Name();
        n1.setName();
    }
    
}
