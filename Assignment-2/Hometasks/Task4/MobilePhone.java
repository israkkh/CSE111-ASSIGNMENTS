package Task4;

public class MobilePhone {
    int contactcapacity ; 
    int totalcontacts ; 
    String [] contactnames = new String[contactcapacity];
    int [] contactnumbers = new int[contactcapacity];

    void setContactCapacity(int capacity){
        this.contactcapacity = capacity;
        this.contactnames = new String[capacity];
        this.contactnumbers = new int[capacity];
    }

    void details(){
        System.out.println("Total Contacts: " + this.totalcontacts);
        System.out.println("Contact List:");
        for(int i = 0 ; i < totalcontacts ; i++){
            System.out.println(contactnames[i] + ":" + contactnumbers[i]);
        }
    }
    
    void addContact(String name, int number){
        if(this.totalcontacts < contactcapacity){
            contactnames[totalcontacts] = name; // add in the index of current contacrt count. 
            contactnumbers[totalcontacts] = number;
            totalcontacts++; // increment total contacts 
            System.out.println("The contact of "+ name + " is added.");
        }
        else{
            System.out.println("Storage Full!!");
        }
    }
    void makeCall(int number){
        for(int i = 0 ; i < totalcontacts ; i++ ){
            if (contactnumbers[i] == number ){
                System.out.println("Calling " + contactnames[i] + ". . . ");
                return;
            }
        }
        System.out.println("Calling " + number + ". . . ");
    }
}
