public class Seat {
    private int number;
    private Passenger passenger;
    private boolean booked;

    public Seat() {
        number = 0;
        booked = false;
    }

    public Seat(int number, Passenger passenger, boolean booked) {
        this.number = number;
        this.passenger = passenger;
        this.booked = booked;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean getBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

}
