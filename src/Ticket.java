public class Ticket {
    private int number=50;
    private String departure,arrive;

    public Ticket() {
        this.number = 0;
        this.departure = "null";
        this.arrive = "null";
    }

    public Ticket(int number, String departure, String arrive) {
        this.number = number;
        this.departure = departure;
        this.arrive = arrive;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
