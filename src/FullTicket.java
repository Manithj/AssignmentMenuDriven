import java.util.Scanner;

public class FullTicket extends Ticket{
    float price;
    public FullTicket() {
        super();
    }
    //coded by Manith Jayaba D/BCE/22/0006

    public FullTicket(int number, String departure, String arrive) {
        super(number, departure, arrive);
    }

    public void price(){
        int option;

        System.out.println("Select arrival and destination :\n" +
                //coded by Manith Jayaba D/BCE/22/0006
                "\n" +
                "[1]Colombo to Jaffna or Jaffna to Colombo\n" +
                "[2]Anuradhapura to Jaffna or Jaffna to Anuradhapura\n" +
                "[3]Vavuniya to Jaffna of Jaffna to Vavuniya\n" +
                "[4]Anuradhapura to Colombo or Colombo to Anuradhapura\n" +
                "[5]Vavuniya to Colombo or Colombo to Vavuniya\n" +
                "\n" +
                "Enter your option :\n");
        Scanner input=new Scanner(System.in);
        option=input.nextInt();
        switch (option){
            case 1:
                price=1000f;
                super.setNumber(super.getNumber()-1);
                //coded by Manith Jayaba D/BCE/22/0006
                break;
            case 2:
            case 5:
                price=700+((700*25)/100);
                super.setNumber(super.getNumber()-1);
                break;
            case 3:
            case 4:
                price=400+((400*25)/100);
                super.setNumber(super.getNumber()-1);
                //coded by Manith Jayaba D/BCE/22/0006
                break;
        }
    }

    public float getPrice(){
        return price;
    }
}
