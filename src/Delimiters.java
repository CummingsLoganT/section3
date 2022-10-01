import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter two integers (on the same line)");
        String integers = scan.nextLine();


        System.out.println("enter two very big integers (on the same line)");
        String bigIntegers = scan.nextLine();


        System.out.println("enter two decimals (on the same line)");
        String decimals = scan.nextLine();


        System.out.println("enter two text values (on the same line)");
        String text = scan.nextLine();

        scan.close();

        System.out.println("\tIntegers: " + integers);
        System.out.println("\tBig integers: " + bigIntegers);
        System.out.println("\tDecimals: " + decimals);
        System.out.println("\tWords: " + text);

    }
}
