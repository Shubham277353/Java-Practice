public class Methods {
    public static void recursion(int n){
        if(n<=0){
            return;
        }
        int number = n - (recursion(n-1));
        System.out.println(number);
    }
    public static void main(String[] args){
        recursion(5);
    }
}

