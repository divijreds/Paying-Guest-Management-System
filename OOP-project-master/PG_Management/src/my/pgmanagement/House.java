package my.pgmanagement;
import java.util.Scanner;

class House extends Entity {
    
    public int rent;
    public String address;
    public int capacity;
    public int no_of_guests = 0;
    public Guest[] guests;
    int choice;

    House(String name, String address, int capacity, int rent) {
        this.name = name;
        this.capacity = capacity;
        this.rent = rent;
        this.address = address;
    }

    Scanner s = new Scanner(System.in);

    public void manage_house() {
        System.out.println("    House " + name + " properties: ");
        System.out.println("        Name: " + name);
        System.out.println("        Address: " + address);
        System.out.println("        Space Available: " + capacity);
        System.out.println("        Rent per head: " + rent);
        System.out.println("        TOTAL RENT: " + (rent * no_of_guests) );

        do{
            System.out.println("Select any one option:");
            System.out.println("    [1] List all Guests");
            System.out.println("    [2] Add Guest");
            System.out.println("    [3] Remove Guest");
            System.out.println("    [9] Exit");
            
            choice = s.nextInt();

            switch(choice) {
            case 1:
                for(int i = 0; i < no_of_guests; i++) {
                    System.out.println( "   #0: " + guests[i] );
                }               
                break;

            case 2:
                System.out.println("Enter name of the new guest >>");
                String name = s.next();
                System.out.println("Enter phone number of the new guest >>");
                String phone = s.next();
                System.out.println("Enter aadhar number >>");
                String aadhar = s.next();
                
                guests[no_of_guests] = new Guest(name, phone, aadhar);
                no_of_guests++;
                break;

            case 3:
                System.out.println("Enter the guest number to delete >> ");
                int number_to_del = s.nextInt();
                guests[number_to_del] = null;
                no_of_guests--;
                break;

            default:
                System.out.println("Invalid Input");
                break;
            }
        }
        while(choice != 9);
    }
}