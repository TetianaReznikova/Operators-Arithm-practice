package Task1;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {

       public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Input product name: ");
        String name = scanner.nextLine();

        System.out.print("Input product quantity, pcs.: ");
        int quantity = scanner.nextInt();

        System.out.print("Input product price, USD: ");
        double price = scanner.nextDouble();

        double coast = price * quantity;
           System.out.printf("Cost of orange is USD %.2f.",
                   coast);

    }
}
