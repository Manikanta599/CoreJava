class Calender
{
    private int monthNumber;
    private String monthName;

    public Calender(int monthNumber)
    {
        if(monthNumber>=1&&monthNumber<=12)
        {
            this.monthNumber=monthNumber;
            this.monthName=nameOfMonth();
        }
    }

    public String nameOfMonth()
    {
        switch (monthNumber) { 
            case 1:
            return "january";
            case 2:
            return "feb";
            case 3:
            return "march";
            case 4:
            return "april";
            case 5:
            return "may";
            case 6:
            return "june";
            case 7:
            return "july";
            case 8:
            return "august";
            case 9:
            return "sept";
            case 10:
            return "oct";
            case 11:
            return "nov";
            case 12:
            return"dec";
            default:
            return "invalid";
                
        }

    }

    public void display()
    {
        System.out.println("month number "+monthNumber);
        System.out.println("month name "+monthName);
    }
}

/**
 * MainCalender
 */
class MainCalender {

    public static void main(String[] args) {
        Calender c=new Calender(8);
        c.display();
    }

    
}