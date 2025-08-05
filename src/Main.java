import java.sql.SQLOutput;

public class Main{
    public static void main(String[] args){
    int[][] myNumbers = {{1,3,5,7},{2,4,6,8}};
        for (int[] myNumber : myNumbers) {
            for (int j = 0; j < myNumber.length; j++) {
                System.out.println(myNumber[j]);
            }
        }
    }
}
