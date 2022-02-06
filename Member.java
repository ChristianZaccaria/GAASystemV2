
/**
 * Abstract superclass Member with common variables, implements iGAAMember interface
 *
 * @author Christian Zaccaria
 * @version 01/04/2021
 */

public abstract class Member implements iGAAMember
{
    //Variables
    private String name;
    private String address;
    private String gender;
    
    //Constructor
    public Member(String name, String address, String gender)
    {
        this.name = name;
        this.address = address;
        this.gender = gender;
    }
    
    
    
    //Getters
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    //Setters
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    
    
    
    
    //toString
    public String toString()
    {
        return "Member details: " + " Name: " + name
        + " Address: " + address
        + " Gender " + gender
        + "\n";
    }
}
