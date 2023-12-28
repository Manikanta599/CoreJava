class Demo
{
    public Demo()
    {
        System.out.println("Demo class constructor executed");

        /* 
         * construcor without args added by developer
         * called by new operator
         * executed by JVM
         */
    }

    
}



/**
 * MainConstructor
 */
class MainConstructor {
    public static void main(String[] args)
    {
        Demo demo1=new Demo();
        Demo demo2=new Demo();
        Demo demo3=new Demo();
    }

     
}