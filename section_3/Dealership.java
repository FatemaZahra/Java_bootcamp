import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Java Dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option){
            case "a": System.out.println("\nYou chose option a"); break;
            case "b":System.out.println("\nYou chose option b"); break;
            default: System.out.println("\nInvalid option");
        }
        scan.close();
    }
}
