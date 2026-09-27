import java.util.Scanner;
 
public class MinimumAge {
    public static void main(String[] args) {
        int[] age = {18, 21, 16, 25, 19};

        int minAge = age[0];

        for (int i = 1; i < age.length; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
            }
        }

        System.out.println("Minimum age = " + minAge);
    }
}