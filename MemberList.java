
/**
 * MemberList stores members in an ArrayList, and methods
 *
 * @author Christian Zaccaria
 * @version 01/04/2021
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;

public class MemberList
{
    //ArrayList
    private ArrayList<Member> members = new ArrayList<>();

    //Default Constructor
    public MemberList()
    {

    }

    //Methods
    
    //This method will return the total amount of fees paid by all Coaches
    public double feesPaidCoaches()
    {
        double Total=0;
        for(Member m: members)
        {
            if(m instanceof Coach)
            {
                Total = Total + (m.calcMembership());
            }
        }
        return Total;
    }

    //This method will return the total amount of fees paid by all Adult Players
    public double feesPaidAdults()
    {
        double Total=0;
        for(Member m: members)
        {
            if(m instanceof AdultPlayer)
            {
                Total = Total + (m.calcMembership());
            }
        }
        return Total;
    }

    //This method will return the total amount of fees paid by all Youth Players
    public double feesPaidYouths()
    {
        double Total=0;
        for(Member m: members)
        {
            if(m instanceof YouthPlayer)
            {
                Total = Total + (m.calcMembership());
            }
        }
        return Total;
    }

    public int numberOfMembers()
    {
        return members.size();
    }

    public void addMember(Member m)
    {
        members.add(m);
    }

    public void removeMember(int index)
    {
        members.remove(index);
    }

    
    //This method will list all the Adult Players in the System
    public String listAdults()
    {
        String list="";
        int i = 0;
        if(members.isEmpty())
        {
            list = "There are no Adult Players in the System";
        }
        else
        {
            for(Member m: members)
            {
                if(m instanceof AdultPlayer)
                {
                    list += "Index " + i + ":\n" + m + "\n-----------------\n";
                    i++;
                }
            }
        }
        return list;
    }
    
    //This method will list all the Youth Players in the System
    public String listYouths()
    {
        String list="";
        int i = 0;
        if(members.isEmpty())
        {
            list = "There are no Youth Players in the System";
        }
        else
        {
            for(Member m: members)
            {
                if(m instanceof YouthPlayer)
                {
                    list += "Index " + i + ":\n" + m + "\n-----------------\n";
                    i++;
                }
            }
        }
        return list;
    }
    
    //This method will list all the Coaches in the System
    public String listCoaches()
    {
        String list="";
        int i = 0;
        if(members.isEmpty())
        {
            list = "There are no Coaches in the System";
        }
        else
        {
            for(Member m: members)
            {
                if(m instanceof Coach)
                {
                    list += "Index " + i + ":\n" + m + "\n-----------------\n";
                    i++;
                }
            }
        }
        return list;
    }

    public String listOfMembers()
    {
        String list="";
        int i = 0;
        if(members.isEmpty())
        {
            list = "There are no Members in the System";
        }
        else
        {
            for(Member m: members)
            {
                list += "Index " + i + ":\n" + m + "\n-----------------\n";
                i++;
            }
        }
        return list;
    }

    @SuppressWarnings("unchecked")
    public void load() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("members.xml"));
        members = (ArrayList<Member>) is.readObject();
        is.close();

    }

    public void save() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("members.xml"));
        out.writeObject(members);
        out.close();

    }
}
