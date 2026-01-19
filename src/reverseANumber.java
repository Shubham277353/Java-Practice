import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        int reversedNumber = 0;
        int number;
        int remainder;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        number = scan.nextInt();

        while (number!=0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        System.out.println("The reversed Number is "+reversedNumber);
    }
}
