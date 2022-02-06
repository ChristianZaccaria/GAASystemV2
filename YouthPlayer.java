
/**
 * Subclass of Member superclass
 *
 * @author Christian Zaccaria
 * @version 01/04/2021
 */
public class YouthPlayer extends Member
{
    //Variables
    private String nextOfKinName;
    private String nextOfKinPhone;
    
    //Constructor
    public YouthPlayer(String name, String address, String gender, String nextOfKinName, String nextOfKinPhone)
    {
        super(name, address, gender);
        this.nextOfKinName = nextOfKinName;
        this.nextOfKinPhone = nextOfKinPhone;
    }
    
    //Getters
    public String getNextOfKinName()
    {
        return nextOfKinName;
    }
    
    public String getNextOfKinPhone()
    {
        return nextOfKinPhone;
    }
    
    //Setters
    public void setNextOfKinName(String nextOfKinName)
    {
        this.nextOfKinName = nextOfKinName;
    }
    
    public void setNextOfKinPhone(String nextOfKinPhone)
    {
        this.nextOfKinPhone = nextOfKinPhone;
    }
    
    public double calcMembership()
    {
        return 25.00;
    }
    
    //toString
    public String toString()
    {
        return "Youth Player\n" + " Name: " + getName() + "\n"
        + " Address: " + getAddress() + "\n"
        + " Gender: " + getGender() + "\n"
        + " Next of Kin Name: " + nextOfKinName + "\n"
        + " Next of Kin Phone Number: " + nextOfKinPhone + "\n"
        + " Membership Annual Fee: " + calcMembership()
        + "\n";
    }
}
