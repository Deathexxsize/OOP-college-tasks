package abstractTask.task1;

public class Task1Main {
    public static void main(String[] args) {
        FirstCar firstCar = new FirstCar("Nissan", "white", 400);
        SecondCar secondCar = new SecondCar("BMW", "black", 350);

        firstCar.gas();
        firstCar.brake();

        secondCar.gas();
        secondCar.brake();


    }
}
