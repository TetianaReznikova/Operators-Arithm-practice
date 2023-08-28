package Task1;

public class Main {
    static String name;
    static double price;
    static double sold;
    static double totalCoast;
    private final static String UNIT = "kg";
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {
    name = "Orange";
    price = 2.59;
    sold = 59.329;
    totalCoast = price * sold;

            System.out.printf("%nProduct: %s, sold %.3f %s, total coast is %s %.2f%n",
                name, sold, UNIT, CURRENCY, totalCoast);
    }

}
