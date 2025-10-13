import java.util.Scanner;

public class KunalKushwahaAssignmentsQuestions {
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.
        Scanner in = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            System.out.print("Enter your name : ");
            String name = in.nextLine();

            System.out.println("Good morning, "+ name + "!");

        }
    }
}
