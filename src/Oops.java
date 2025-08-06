public class Oops {
    int carSpeed = 100;
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can.");
    }

    public static void main(String[] args){
        Methods mObj = new Methods();
        System.out.println(mObj.x);
        Oops myObj = new Oops();
        System.out.println(myObj.carSpeed);
        myObj.carSpeed = 200;
        System.out.println(myObj.carSpeed);
        myObj.fullThrottle();
    }
}
