class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void showModel() {
        System.out.println("Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota");

        // Direct access to model is not allowed
        // System.out.println(c1.model); // Compile Time Error

        c1.showModel();
    }
}
