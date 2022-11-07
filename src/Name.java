import java.util.Scanner;
public class Name {
    private String first,middle,last;
    //coded by Manith Jayaba D/BCE/22/0006

    public Name() {
        this.first = "null";
        this.middle = "null";
        //coded by Manith Jayaba D/BCE/22/0006
        this.last = "null";
    }

    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getNameWithIns(){
        char [] arr=first.toCharArray();
        //coded by Manith Jayaba D/BCE/22/0006
        char [] arr1=middle.toCharArray();
        return arr[0]+"."+arr1[0]+" "+last;
    }

    public void addNewName(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first,middle and last name :");
        first=input.nextLine();
        middle= input.nextLine();
        //coded by Manith Jayaba D/BCE/22/0006
        last= input.nextLine();
    }

}
