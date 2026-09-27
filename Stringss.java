import java.util.Scanner;

public class Stringss{

    public static void main(String[] args){
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        name = sc.next();

        System.out.print("Enter your surname: ");
        String surname = sc.next();

        String fullname = name+ " "+surname;

        System.out.println("Full Name: "+fullname.toUpperCase());
        sc.close();
    }
}