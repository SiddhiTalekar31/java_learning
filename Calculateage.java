
import java.util.Scanner;

public class Calculateage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your year of birth: ");
        int birthyear = sc.nextInt();
        int age = java.time.Year.now().getValue() - birthyear;
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        sc.close();
    }
}
