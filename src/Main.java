import java.util.Scanner;
public class Main {




    //coded by Manith Jayaba D/BCE/22/0006
    static int option;
    static int snum;
    static Passenger pas[] = new Passenger[50];
    static  Seat s[]=new Seat[50];
    public static void main(String[] args) {

        for(int i=0;i<50;i++){
            s[i]=new Seat();
            pas[i]=new Passenger();
        }

        for(int i=0;i<50;i++){
        s[i].setBooked(false);
    }



        do {
            System.out.println("\n" +
                    "------------------------------------------------\n" +
                    " MENU \n" +
                    "------------------------------------------------\n" +
                    "[1]Check Availability\n" +
                    "[2]Book New Seat\n" +
                    "[3]Print Summary\n" +
                    "[4]Exit\n" +
                    "------------------------------------------------\n");
            //coded by Manith Jayaba D/BCE/22/0006
            System.out.println("Enter your option :");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            switch (option) {
                case 1:
                    Bus.printAvailability();
                    break;
                case 2:
                    Bus.bookNewSeatFromKB();
                    break;
                case 3:
                    Bus.printSummerySheet();
                    break;
                case 4:
                    System.out.println("Exit");
                default:
                    System.out.println("Error try again");
            }
        } while (option != 4);
        //coded by Manith Jayaba D/BCE/22/0006
    }




}
