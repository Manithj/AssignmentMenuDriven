import java.util.Scanner;
public class Name {
    private String first,middle,last;

    public Name() {
        this.first = "null";
        this.middle = "null";
        this.last = "null";
    }

    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getNameWithIns(){
        char [] arr=first.toCharArray();
        char [] arr1=middle.toCharArray();
        return arr[0]+"."+arr1[0]+" "+last;
    }

    public void addNewName(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first,middle and last name :");
        first=input.nextLine();
        middle= input.nextLine();
        last= input.nextLine();
    }

}
