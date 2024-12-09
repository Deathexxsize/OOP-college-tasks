package interfaceTasks.task1;

public class Main {
    public static void main(String[] args) {
        Swimable[] oceanarium = new Swimable[15];

        for (int i = 0; i <= 4; i++) {
            oceanarium[i] = new Shark();
            for (int j = 5; j <= 9; j++) {
                oceanarium[j] = new Duck();
                for (int k = 10; k < 15; k++) {
                    oceanarium[k] = new Turtle();
                }
            }
        }
    }
}
