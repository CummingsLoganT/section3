import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println("-Select option 'a' to buy a car");
        System.out.println("-Select option 'b' to buy a car");

        String option = scan.nextLine();
        switch (option) {
            case "a":
                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available.");
                    System.out.println("\nDo you have insurance? Write 'yes or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                    String license = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && creditScore > 660) {
                        System.out.println("Sold!");
                    } else {
                        System.out.println("We're sorry. git gud");
                    }
                } else {
                    System.out.println("no cars are available");
                }
            case "b":
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();

                if (value > price && price < 30000) {
                    System.out.println("We will buy your car.");
                } else {
                    System.out.println("get out of my sight");
                }
                break;
            default:
                System.out.println("some error, idk");
        }

    }
}
