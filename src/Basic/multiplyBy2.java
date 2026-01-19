package Basic;

import java.util.Arrays;

public class multiplyBy2 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,55,332};
        System.out.println(Arrays.toString(arr));
        mutliplyByTwo(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void mutliplyByTwo(int[] array){
        for (int i = 0 ; i < array.length ; i++ ){
            array[i] = array[i]*2;
        }
    }
}
