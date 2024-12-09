package abstractTask.task1;

public class FirstCar extends Car {

    public FirstCar(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    public void gas() {
        System.out.println( super.getModel() + " is moving");
    }

    public void brake() {
        System.out.println( super.getModel() + " is braking");
    }

}
