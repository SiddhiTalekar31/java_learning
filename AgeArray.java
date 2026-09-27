import java.util.Scanner;

public class AgeArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the total students: ");
         int size = sc.nextInt();
        int marks[] = new int[size];

        double sum =0;

        for(int i=0;i<size;i++){
            System.out.print("Enter the marks of students: "+(i+1)+":");
            marks[i]=sc.nextInt();
            sum+=marks[i];
        }
        System.out.println("Average marks are: "+(sum/size));
    }
}