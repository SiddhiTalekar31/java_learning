import java.util.Scanner;

public class Character{

    public static void main(String[] args){
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        name = sc.next();

        System.out.print("Enter your surname: ");
        String surname = sc.next();

        String fullname = name+ " "+surname;

        System.out.println("Full Name: "+fullname.toUpperCase());

        String txt1 = "Please locate where 'locate' occurs!";
        System.out.println(txt1.indexOf("Incate"));

        String txt2 = "Hello";
        System.out.println(txt2.charAt(0));
        System.out.println(txt2.charAt(4));

        sc.close();

    }
}