import java.util.Scanner;

public class Costitem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the items: ");
        int items = sc.nextInt();
        System.out.print("Enter the item costperitem: ");
        float itemCostperitem = sc.nextFloat();
        float totalCost = items * itemCostperitem;
        char currencySymbol = '$';
        System.out.println("The total cost of the item is: " + currencySymbol + totalCost);
        sc.close();
    }

}
