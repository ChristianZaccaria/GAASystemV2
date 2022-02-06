
/**
 * User Interface for the user
 *
 * @author Christian Zaccaria
 * @version 01/04/2021
 */
import java.util.ArrayList;

public class GAASystem
{
    //creating object memberlist1 from the MemberList class
    private MemberList memberlist1 = new MemberList();

    //Default Constructor
    public GAASystem()
    {

    }

    public static void main(String[] args)
    {
        GAASystem ms1 = new GAASystem();

        ms1.runMenu();

    }
    //This method displays the different options to the User
    public int mainMenu()
    {
        System.out.println("\n GAA System Menu");
        System.out.println("______________________");

        System.out.println("   1. Load All Members from file");
        System.out.println("______________________");
        System.out.println("   2. Register a new Member");
        System.out.println("   3. List all Members in the System");
        System.out.println("   4. Delete a Member from the System");
        System.out.println("______________________");
        System.out.println("   5. Number of Members in the System");
        System.out.println("   6. View Total fees paid by all Members");
        System.out.println("   7. List Members from a specific Category");
        System.out.println("______________________");
        System.out.println("   8. Save Members to file");
        System.out.println("______________________");
        System.out.println("   0. Exit the Menu");
        System.out.println();
        System.out.println("Enter choice [0-8]: ");

        // get choice
        int choice = EasyScanner.nextInt();
        System.out.println("\n ______________________");
        return choice; 
    }

    public void runMenu()
    {
        int option = mainMenu();
        while(option !=0)
        {
            switch (option)
            {
                case 1:

                try{
                    memberlist1.load();
                    System.out.println("Members have been loaded to the System");

                }

                catch (Exception e)
                { 
                    System.out.println("Error reading from file: " + e);
                }
                break;

                case 2:
                createMember();
                break;

                case 3:
                System.out.println(memberlist1.listOfMembers());
                break;

                case 4:
                deleteMember();
                break;

                case 5:
                quantityOfMembers();
                break;

                case 6:
                totalFees();
                break;

                case 7:
                listMembersByCategory();
                break;

                case 8:

                try{
                    memberlist1.save();
                    System.out.println("Members have been saved to file");

                }
                catch (Exception e){
                    System.out.println("Error writing to file: " + e);
                }
                break;

                default:
                System.out.println("Please select a valid option...");

            }
            System.out.println();
            option = mainMenu();
        }
    }

    private void createMember()
    {
        int choice;
        System.out.println("\n_______________________");
        System.out.println("What kind of Member do you want to add?");
        System.out.println("\t 1. Adult Player");
        System.out.println("\t 2. Youth Player");
        System.out.println("\t 3. Coach");
        System.out.println();
        System.out.print("Enter choice [1-3]:");
        choice = EasyScanner.nextInt();

        //getting details from user...
        System.out.println("Enter the new Member details...");
        System.out.print("Name: ");
        String name = EasyScanner.nextString();
        System.out.print("Address: ");
        String address = EasyScanner.nextString();
        System.out.print("Gender: ");
        String gender = EasyScanner.nextString();

        if(choice == 1)
        {
            String phone;
            System.out.print("Enter the player's phone number: ");
            phone = EasyScanner.nextString();

            String email;
            System.out.print("Enter the player's email address: ");
            email = EasyScanner.nextString();
            System.out.println("\n_______________________");

            AdultPlayer a1 = new AdultPlayer(name, address, gender, phone, email);

            memberlist1.addMember(a1);
            System.out.println("Adult Player has been added to the System");
        }

        if(choice == 2)
        {
            String nextOfKinName;
            System.out.print("Enter the player's Next of Kin name: ");
            nextOfKinName = EasyScanner.nextString();

            String nextOfKinPhone;
            System.out.print("Enter the player's Next of Kin phone number: ");
            nextOfKinPhone = EasyScanner.nextString();
            System.out.println("\n_______________________");

            YouthPlayer y1 = new YouthPlayer(name, address, gender, nextOfKinName, nextOfKinPhone);

            memberlist1.addMember(y1);
            System.out.println("Youth Player has been added to the System");
        }

        if(choice == 3)
        {
            String dateOfGardaClearance;
            System.out.print("Enter the Coach's date of Garda Clearance: ");
            dateOfGardaClearance = EasyScanner.nextString();
            System.out.println("\n_______________________");

            Coach c1 = new Coach(name, address, gender, dateOfGardaClearance);

            memberlist1.addMember(c1);
            System.out.println("Coach has been added to the System");
        }
    }

    public void quantityOfMembers()
    {
        System.out.println("The number of Members in our System is: " + memberlist1.numberOfMembers());
    }

    //This will display the fees paid in total by each group such as Coaches, Adult Players, and Youth Players. The Total sum amount will also be displayed at the end
    public void totalFees()
    {

        System.out.println("Total Fees paid by all Coaches: " + memberlist1.feesPaidCoaches());
        System.out.println("Total Fees paid by all Adult Players: " + memberlist1.feesPaidAdults());
        System.out.println("Total Fees paid by all Youth Players: " + memberlist1.feesPaidYouths());
        System.out.println();
        System.out.println("Fees paid in Total by all members: " + (memberlist1.feesPaidCoaches() + memberlist1.feesPaidAdults() + memberlist1.feesPaidYouths()));

    }

    //This will list the Members by their specific group such as listing only all Adult Players or all Youth Players or all Coaches
    public void listMembersByCategory()
    {
        int choice;
        System.out.println("\n_______________________");
        System.out.println("Which Members would you like to View?");
        System.out.println("\t 1. Adult Players");
        System.out.println("\t 2. Youth Players");
        System.out.println("\t 3. Coaches");
        System.out.println();
        System.out.print("Enter choice [1-3]:");
        choice = EasyScanner.nextInt();

        if(choice == 1)
        {
            System.out.println("\n_______________________");
            System.out.println(memberlist1.listAdults());
        }

        if(choice == 2)
        {
            System.out.println("\n_______________________");
            System.out.println(memberlist1.listYouths());
        }

        if(choice == 3)
        {
            System.out.println("\n_______________________");
            System.out.println(memberlist1.listCoaches());
        }

        
    }

    private void deleteMember()
    {
        System.out.println(memberlist1.listOfMembers());
        System.out.print("Enter the index number of the Member you wish to delete...");
        int index = EasyScanner.nextInt();

        memberlist1.removeMember(index);
        System.out.println("Member removed from the System");
    }
}
