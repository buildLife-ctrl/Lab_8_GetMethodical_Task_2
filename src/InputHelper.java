import java.util.Scanner;

public class InputHelper {
    public static int getInt(Scanner scan, String prompt) {
        int num = 0; //eventually returned to user after validated
        boolean check = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                check = true;
            } else {
                System.out.println("Invalid input, please try again");
            }
            scan.nextLine();
        } while (!check);

        return num;
    }

    public static double getDouble(Scanner scan, String prompt) {
        double input = 0;
        boolean check = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextDouble()) {
                input = scan.nextDouble();
                if (input % 1 != 0) {
                    check = true;
                } else {
                    System.out.println("Please enter a decimal value.");
                }
            } else {
                System.out.println("Invalid input, please try again");
            }
            scan.nextLine();
        } while (!check);

        return input;
    }
}
