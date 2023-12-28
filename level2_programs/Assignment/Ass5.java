class Open
{
    public void openBottle()
    {
        System.out.println("open bottle");
    }
} 
class Close
{
    public static void closeBottle()
    {
        System.out.println("close bottle");
        Open o=new Open();
        o.openBottle();
        
    }
}

class Drink
{
    public static void drink()
    {
        System.out.println("drink water");
        Close.closeBottle();
    }
}
class Ass5
{
    public static void main(String[] args)
    {
        Drink.drink();
    }
}

