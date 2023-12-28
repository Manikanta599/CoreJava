class Mobile
{
    private String brandName;
    private int ramSize;
    private int storage;
    private double frontCam;
    private double backCam;
    public Mobile(String brandName,int ramSize,int storage,double frontCam,double backCam)
    {
        int c=0;
        for(int i=0;i<=brandName.length()-1;i++)
        {
            char ch=brandName.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                c++;
            } 
        }

        if(c==brandName.length())
        {
            this.brandName=brandName;
        }
        else
        {
            System.out.println("invalid brand name");
        }

        if(ramSize>=2&&ramSize<=10)
        {
            this.ramSize=ramSize;
        }
        else
        {
            System.out.println("invalid ramSize");
        }

        if(storage>=60&&storage<=250)
        {
            this.storage=storage;
        }
        else
        {
            System.out.println("invalid storage capacity");
        }

        if(frontCam>=3.2 && frontCam<=8.6)
        {
            this.frontCam=frontCam;
        }
        else
        {
            System.out.println("invaid frontcam pixels");
        }

        if(backCam>=12.5&&backCam<=22.5)
        {
            this.backCam=backCam;
        }
        else
        {
            System.out.println("invalid backcam mp");
        }


    }

    public void detailsOfMobile()
    {
        System.out.println("brandName "+brandName);
        System.out.println("ramsize "+ramSize);
        System.out.println("storaze "+storage);
        System.out.println("front camera "+frontCam);
        System.out.println("back camera "+backCam);
    }
}

/**
 * MainMobile
 */
class MainMobile {

    public static void main(String[] args)
    {
        Mobile mobile1=new Mobile("realme", 4, 64, 5.2, 18.3);
        mobile1.detailsOfMobile();
    }

    
}