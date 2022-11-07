public class Ticket {
    private int number=50;
    private String departure,arrive;
    //coded by Manith Jayaba D/BCE/22/0006

    public Ticket() {
        this.number = 0;
        this.departure = "null";
        this.arrive = "null";
    }

    public Ticket(int number, String departure, String arrive) {
        //coded by Manith Jayaba D/BCE/22/0006
        this.number = number;
        this.departure = departure;
        this.arrive = arrive;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        //coded by Manith Jayaba D/BCE/22/0006
        this.number = number;
    }
}
