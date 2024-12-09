package objectClassConstructorTasks.task2;

public class Main {
    public static void main(String[] args) {
        Students[] students = new Students[5];

        students[0] = new Students("Bob", 21, "java");
        students[1] = new Students("Bill", 19, "js");
        students[2] = new Students("Jack", 17, "java");
        students[3] = new Students("Alica", 18, "js");
        students[4] = new Students("Julia", 20, "java");

        int java = 0;
        int js = 0;
        double age = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup().equals("java")) {
                java++;
            } else if (students[i].getGroup().equals("js")) {
                js++;
            }
            age += students[i].getAge();
        }

        System.out.println("Студенты Java: " + java + "\nСтуденты js: " + js);
        System.out.println("Средний возраст студентов: " + age / students.length);

    }
}
