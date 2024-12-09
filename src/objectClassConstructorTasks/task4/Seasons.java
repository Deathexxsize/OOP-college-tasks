package objectClassConstructorTasks.task4;

public class Seasons {
    public void seoson(int num) {
        switch (num) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Введите значение от 1 - 4");
                break;
        }
    }
}
