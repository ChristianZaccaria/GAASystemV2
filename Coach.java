
/**
 * Subclass of the superclass Member
 *
 * @author Christian Zaccaria
 * @version 01/04/2021
 */
public class Coach extends Member
{
    //Variables
    private String dateOfGardaClearance;

    //Constructor
    public Coach(String name, String address, String gender, String dateOfGardaClearance)
    {
        super(name, address, gender);
        this.dateOfGardaClearance = dateOfGardaClearance;
    }

    //Getters
    public String getDateOfGardaClearance()
    {
        return dateOfGardaClearance;
    }

    //Setters
    public void setDateOfGardaClearance(String dateOfGardaClearance)
    {
        this.dateOfGardaClearance = dateOfGardaClearance;
    }

    public double calcMembership()
    {
        return 50.00;
    }
    
   
   
    
    //toString
    public String toString()
    {
        return "Coach\n" + " Name: " + getName() + "\n"
        + " Address: " + getAddress() + "\n"
        + " Gender: " + getGender() + "\n"
        + " Date of Garda Clearance: " + dateOfGardaClearance + "\n"
        + " Membership Annual Fee: " + calcMembership()
        + "\n";
    }
}

