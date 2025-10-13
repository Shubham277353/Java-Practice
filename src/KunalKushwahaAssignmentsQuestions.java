import java.util.Scanner;

public class KunalKushwahaAssignmentsQuestions {
    public static void main(String[] args) {
        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal amount : ");
        double principal = in.nextDouble();
        System.out.print("Enter the time (in years): ");
        double time = in.nextDouble();
        System.out.print("Enter the rate : ");
        double rate = in.nextDouble();

        double simpleInterest = (principal*time*rate)/100;
        System.out.println("Your simple interst is " + simpleInterest);
    }
}
