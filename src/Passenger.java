import java.util.Scanner;

public class Passenger {
    private Name name;
    private int age;
    private Ticket ticket;
    private String gender;

    public Passenger() {
        this.age = 0;
        this.gender = "null";
    }

    public Passenger(Name name, int age, Ticket ticket, String gender) {
        this.name = name;
        this.age = age;
        this.ticket = ticket;
        this.gender = gender;
    }

    public void addNewPassengerFromKB(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter gender :");
        gender=input.nextLine();
        System.out.println("Enter age :");
        age=input.nextInt();

    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public String getGender() {
        return gender;
    }
}
