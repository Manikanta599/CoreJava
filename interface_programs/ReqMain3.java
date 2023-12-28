interface Sup
{
    void met();
}

class Sub implements Sup
{
    public void met()
    {
        System.out.println("met ");
    }

    public void own()
    {
        System.out.println("own");
    }
}

/**
 * ReqMain3
 */
public class ReqMain3 {

    public static void main(String[] args) {
        Sup s1=(Sup) new Sub();
        s1.met();

        Sub s2=(Sub) s1;
        s2.own();
        s2.met();
    }
}