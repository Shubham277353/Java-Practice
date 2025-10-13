import java.util.Scanner;

public class KunalKushwahaAssignmentsQuestions {
    public static void main(String[] args) {
        // Write a program to print whether a number is even or odd, also take input from the user.
        Scanner in = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            System.out.print("Enter the number: ");
            int num = in.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number");
            }

        }
    }
}
