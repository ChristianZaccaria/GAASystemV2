
/**
 * Subclass of the superclass Member
 *
 * @author Christian Zaccaria
 * @version 01/04/2021
 */
public class AdultPlayer extends Member
{
    //Variables
    private String phone;
    private String email;

    //Constructor
    public AdultPlayer(String name, String address, String gender, String phone, String email)
    {
        super(name, address, gender);
        this.phone = phone;
        this.email = email;
    }

    //Getters  
    public String getPhone()
    {
        return phone;
    }

    public String getEmail()
    {
        return email;
    }

    //Setters
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public double calcMembership()
    {
        return 100.00;
    }
    
    //toString
    public String toString()
    {
       return "Adult Player\n" + " Name: " + getName() + "\n"
        + " Address: " + getAddress() + "\n"
        + " Gender: " + getGender() + "\n"
        + " Phone: " + phone + "\n"
        + " Email: " + email + "\n"
        + " Membership Annual Fee: " + calcMembership()
        + "\n"; 
    }
    

}
