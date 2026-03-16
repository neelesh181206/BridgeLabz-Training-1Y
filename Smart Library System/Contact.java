class Contact {

    String name;
    String phoneNumber;

    // Constructor
    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
    }
}

class BusinessContact extends Contact {

    String companyName;

    // Constructor
    BusinessContact(String name, String phoneNumber, String companyName) {
        super(name, phoneNumber);
        this.companyName = companyName;
    }

    // Override display method
    @Override
    void display() {

        String formattedName = name.toUpperCase();

        System.out.printf("Name: %s\n", formattedName);
        System.out.printf("Phone: %s\n", phoneNumber);
        System.out.printf("Company: %s\n", companyName);
    }
}

public class ContactApp {

    public static void main(String[] args) {

        Contact c1 = new Contact("Neelu", "9876543210");

        BusinessContact c2 = new BusinessContact(
                "Amit",
                "9123456789",
                "TechSoft"
        );

        c1.display();

        System.out.println();

        c2.display();
    }
}