import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {

    private final String userID;
    private String email;
    private String name;
    private String phone;
    private final String password;
    private String address;
    private int age;
    public List<Flight> flightsRegisteredByUser = new ArrayList<>();
    public List<Integer> numOfTicketsBookedByUser = new ArrayList<>();
    public static final List<Customer> customerCollection = User.getCustomersCollection();

    public Customer() {
        this.userID = null;
        this.password = null;
    }

    public Customer(String name, String email, String password, String phone, String address, int age) {
        RandomGenerator random = new RandomGenerator();
        random.randomIDGen();
        this.name = name;
        this.userID = random.getRandomNumber();
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.age = age;
    }

    public void addNewCustomer() {
        System.out.println("\n\n\n" + "Welcome to the Customer Registration Portal");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:\t");
        String name = scanner.nextLine();
        System.out.print("Enter your email address:\t");
        String email = scanner.nextLine();
        while (isUniqueData(email)) {
            System.out.println("ERROR!!! User with the same email already exists...");
            System.out.print("Enter your email address:\t");
            email = scanner.nextLine();
        }
        // ... (rest of the input handling)
        customerCollection.add(new Customer(name, email, password, phone, address, age));
    }

    // ... (rest of the methods)

    private void displayArtWork(int option) {
        // ... (artwork strings)
        System.out.println(artWork);
    }

   // Getters and Setters
   public List<Flight> getFlightsRegisteredByUser() {
    return flightsRegisteredByUser;
}

public String getPassword() {
    return password;
}

public String getPhone() {
    return phone;
}

public String getAddress() {
    return address;
}

public String getEmail() {
    return email;
}

public int getAge() {
    return age;
}

public String getUserID() {
    return userID;
}

public String getName() {
    return name;
}

public List<Integer> getNumOfTicketsBookedByUser() {
    return numOfTicketsBookedByUser;
}

public void setName(String name) {
    this.name = name;
}

public void setEmail(String email) {
    this.email = email;
}

public void setPhone(String phone) {
    this.phone = phone;
}

public void setAddress(String address) {
    this.address = address;
}

public void setAge(int age) {
    this.age = age;
}
}

}
