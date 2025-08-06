public class Car {
    String name;
    String model;
    int yearOfBuild;
    int startingPrice;

    public Car(String name, String model, int year, int price) {
        this.name = name;
        this.model = model;
        this.yearOfBuild = year;
        this.startingPrice = price;
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void showMaxSpeed(int speed) {
        System.out.println("The max speed is " + speed + " km/h.");
    }

    public void displayInfo() {
        System.out.println("=== Car Details ===");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year of Build: " + yearOfBuild);
        System.out.println("Starting Price: ₹" + startingPrice);
    }

    @Override
    public String toString() {
        return name + " " + model + " (" + yearOfBuild + ")";
    }

    public static void main(String[] args) {
        Car myCar = new Car("Aventador", "Lamborghini", 2003, 8000000);

        myCar.displayInfo();
        myCar.fullThrottle();
        myCar.showMaxSpeed(350);

        System.out.println("toString() output: " + myCar);
    }
}
