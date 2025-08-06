public class Methods {
    int x = 39;
    public static void recursion(int n){
        if(n<1){
            return;
        }
        recursion(n-1);
        if(n%2!=0){
        System.out.println(n);
        }
    }
    public static void main(String[] args){
        recursion(10);
    }
}
