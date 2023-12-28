class Mobile
{
    private String brandName;
    private int ramSize;
    private int storage;
    private int frontCam;
    private int backCam;
    public Mobile(String n,int r,int s,double f,double b)
    {
        int c=0;
        for(int i=0;i<=n.length()-1;i++)
        {
            char ch=n.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                c++;
            } 
        }

        if(c==n.length())
        {
            brandName=n;
        }
        else
        {
            System.out.println("invalid brand name");
        }

        if(r>=2&&r<=10)
        {
            ramSize=r;
        }
        else
        {
            System.out.println("invalid ramSize");
        }

        if(s>=60&&s<=250)
        {
            storage=s;
        }
        else
        {
            System.out.println("invalid storage capacity");
        }

        if(f>=3.2 && f<=8.6)
        {
            frontCam=f;
        }
        else
        {
            System.out.println("invaid frontcam pixels");
        }

        if(b>=12.5&&)


    }
}