import java.util.Scanner;

public class TaskTwoFavNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int favInt = InputHelper.getInt(scan, "What is your favorite integer?");
        double favDouble = InputHelper.getDouble(scan, "What is your favorite double?");
        System.out.println("Your favorite integer is " + favInt + " and your favorite double is " + favDouble);
    }
}
