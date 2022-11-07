public class Seat {
    private int number;
    //coded by Manith Jayaba D/BCE/22/0006
    private Passenger passenger;
    private boolean booked;

    public Seat() {
        number = 0;
        //coded by Manith Jayaba D/BCE/22/0006
        booked = false;
    }

    public Seat(int number, Passenger passenger, boolean booked) {
        this.number = number;
        this.passenger = passenger;
        //coded by Manith Jayaba D/BCE/22/0006
        this.booked = booked;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean getBooked() {
        return booked;
    }
    //coded by Manith Jayaba D/BCE/22/0006

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

}
