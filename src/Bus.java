import java.util.Scanner;
public class Bus {

    static int [] arr=new int [50];

    static int count=0;

    static int snum;
    static Passenger pas[] = new Passenger[50];
    static  Seat s[]=new Seat[50];
    static FullTicket ft[]=new FullTicket[50];
    static HalfTicket ht[]=new HalfTicket[50];

    static Name n[]=new Name[50];
    private String number,date,location,time;
    private Seat seat;



    public Bus() {
        this.number = "null";
        this.date = "null";
        this.location = "null";
        this.time = "null";
    }

    public static void bookNewSeatFromKB(){
        for(int i=0;i<50;i++){

            s[i]=new Seat();
            pas[i]=new Passenger();
            ft[i]=new FullTicket();
            ht[i]=new HalfTicket();
            n[i]=new Name();
        }
        int option;
        System.out.println("Enter Seat number :");
        Scanner input=new Scanner(System.in);
        snum= input.nextInt();
        snum=snum-1;
        if(s[snum].getBooked()==true){
            System.out.println("sorry this seat is booked...");
        }
        else {
            s[snum].setBooked(true);
            n[snum].addNewName();
            pas[snum].addNewPassengerFromKB();
            System.out.println("Enter ticket choice\n" +
                    "[1]Full ticket\n" +
                    "[2]Half ticket\n" +
                    "" +
                    "Enter your choice :");
            Scanner input0=new Scanner(System.in);
            option=input0.nextInt();
            switch (option){
                case 1:
                    ft[snum].price();
                    s[snum].setBooked(true);
                    count=count+1;
                    arr[snum]=snum;
                    break;
                case 2:
                    ht[snum].price();
                    s[snum].setBooked(true);
                    count=count+1;
                    break;
                default:
                    System.out.println("Error");
            }
        }
        //not complete

    }

    public static void printSummerySheet(){
        for(int i=0;i<50;i++){
            s[i]=new Seat();
        }
        for(int i=0;i<50;i++){
            System.out.println("Name :"+n[i].getNameWithIns()+"\n" +
                    "Age :"+pas[i].getAge()+"\n" +
                    "Gender :"+pas[i].getGender()+"\n" +
                    "");

            if(ft[i].getPrice()>0){
                System.out.println("Ticket Price :"+ft[i].getPrice());
            }
            else{
                System.out.println("Ticket Price :"+ht[i].getPrice());
            }
        }
    }

    public static void printAvailability(){

        System.out.println("Total available seats :"+(50-count));
    }

}
