class Drink
{
    public static void startDrink()
    {
        System.out.println("Start drink");
        stopDrink(); /* c1 */
    }

    public static void stopDrink()
    {
        System.out.println("stop drink");
    }
}
class Open
{
    public void openBottle()
    {
        System.out.println("open bottle");
        closeBottle();  /* c2 */
    }
    public void closeBottle()
    {
        System.out.println("close bottle");
    }
}

class Mainclass1
{
    public static void main(String[] args)
    {

        Drink.startDrink();  /* L2-c5 */
        Open o=new Open();   /* L2-c6 */
        o.openBottle();
    }
}