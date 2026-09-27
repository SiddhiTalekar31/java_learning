import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {
        int citizenAge[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Ages : ");
        for (int i = 0; i < citizenAge.length; i++) {
            citizenAge[i] = sc.nextInt();
        }
        for (int age : citizenAge) {
            System.out.println("Age of the citizen is : " + age);
        }
        sc.close();
    }
}
