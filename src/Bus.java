import java.util.Scanner;
public class Bus {

    //coded by Manith Jayaba D/BCE/22/0006

    static int count=0;

    static Passenger pas[] = new Passenger[50];
    static  Seat s[]=new Seat[50];
    //coded by Manith Jayaba D/BCE/22/0006
    static FullTicket ft[]=new FullTicket[50];
    static HalfTicket ht[]=new HalfTicket[50];

    static Name n[]=new Name[50];
    private String number,date,location,time;
    //coded by Manith Jayaba D/BCE/22/0006
    private Seat seat;



    public Bus() {
        this.number = "null";
        this.date = "null";
        this.location = "null";
        this.time = "null";
    }

    public static void bookNewSeatFromKB(){
        for(int i=count;i<50;i++){

            s[i]=new Seat();
            pas[i]=new Passenger();
            ft[i]=new FullTicket();
            //coded by Manith Jayaba D/BCE/22/0006
            ht[i]=new HalfTicket();
            n[i]=new Name();
        }
        int option;

            n[count].addNewName();
            pas[count].addNewPassengerFromKB();
            System.out.println("Enter ticket choice\n" +
                    "[1]Full ticket\n" +
                    "[2]Half ticket\n" +
                    "" +
                    "Enter your choice :");
            Scanner input0=new Scanner(System.in);
            option=input0.nextInt();
            switch (option){
                case 1:
                    ft[count].price();
                    //coded by Manith Jayaba D/BCE/22/0006
                    count=count+1;
                    break;
                case 2:
                    ht[count].price();
                    count=count+1;
                    break;
                default:
                    System.out.println("Error");
            }

        //not complete

    }

    public static void printSummerySheet(){
        for(int i=0;i<50;i++){
            s[i]=new Seat();
            //coded by Manith Jayaba D/BCE/22/0006
        }
        for(int i=0;i<count;i++){
            System.out.println("Name :"+n[i].getNameWithIns()+"\n" +
                    "Age :"+pas[i].getAge()+"\n" +
                    "Gender :"+pas[i].getGender());

            if(ft[i].getPrice()>0){
                System.out.println("Ticket Price :"+ft[i].getPrice());
                //coded by Manith Jayaba D/BCE/22/0006
            }
            else{
                System.out.println("Ticket Price :"+ht[i].getPrice());
            }
            System.out.println("\n");
        }
    }

    public static void printAvailability(){

        System.out.println("Total available seats :"+(50-count));
    }

}
