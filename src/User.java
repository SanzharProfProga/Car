import java.math.BigDecimal;
import java.util.Scanner;

public class User {
    private String firstName;
    private String lastName;
    private String address;
    private long phoneNumber;
    private BigDecimal money;
    private String password;

    private Car car;

    public User(String firstName, String lastName, String address, long phoneNumber,String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }



    public User(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String pay(BigDecimal money){
        setMoney(getMoney().subtract(money));
        return "Pay" ;
    }
    public String deposit (BigDecimal money){
        setMoney(getMoney().add(money));
        return "Deposit";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User saveUser(){
        System.out.println("Enter name: ");
        String name= new Scanner(System.in).nextLine();
        System.out.println("Enter surname: ");
        String lastName = new Scanner(System.in).nextLine();
        System.out.println("Enter address: ");
        String address = new Scanner(System.in).nextLine();
        System.out.println("Enter phone number: ");
        long phoneNumber = new Scanner (System.in).nextLong();
        System.out.println("Come up with a strong password containing 8 characters");
        String password = "";
        boolean isTrue = true;
        while (isTrue){
            String password1 = new Scanner(System.in).nextLine();
            int lengthPassword = password1.length();
            if (lengthPassword >= 8){
                password = password1;
                isTrue = false;
            }else {
                System.out.println("The password does not contain 8 characters!");
                isTrue = true;
            }
        }

        User user = new User(name,lastName,address,phoneNumber,password);
        System.out.println("Data saved");
        return user;
    }
    public BigDecimal pay(int pay){
        money.divide(BigDecimal.valueOf(pay));
        return money;
    }
    public BigDecimal deposit(int deposit){
        money.add(BigDecimal.valueOf(deposit));
        return money;
    }

    @Override
    public String toString() {
        return "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nAddress: " + address +
                "\nPhone number: " + phoneNumber;
    }

}
