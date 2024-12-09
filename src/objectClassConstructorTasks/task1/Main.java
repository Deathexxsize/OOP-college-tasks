package objectClassConstructorTasks.task1;

public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport(221434, "Kurmanbek", "Baltaev", "01.01.2001", "Kyrgyzstan");
       passport.printInfo();
    }
}
