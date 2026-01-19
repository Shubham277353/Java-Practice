package Basic;

import java.util.Arrays;

public class swaping {
    public static void main(String[] args) {
        int[] arr = {10,11};
        swapNumners(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swapNumners(int[] nums){
       int temp =  nums[0];
       nums[0] = nums[1];
       nums[1] = temp ;
    }
}
