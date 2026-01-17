import java.util.Scanner;

public class Main{

    public static void swapNumbers(num1,num2){
        int temp = num1;
        int num1 = num2;
        int num2 = temp;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 11;
        swapNumbers(num1,num2);
    }
}