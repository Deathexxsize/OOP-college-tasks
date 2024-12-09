package objectClassConstructorTasks.task3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Students[] students = new Students[5];

        students[0] = new Students("Bek", "10.01.2000", 552873902, "Kyrgyz");
        students[1] = new Students("Tek", "10.04.1999", 772909200, "Uzbek");
        students[2] = new Students("Chek", "10.10.2001", 992873902, "Uzbek");
        students[3] = new Students("Pek", "10.11.2002", 992333902, "Russian");
        students[4] = new Students("Shek", "06.06.2000", 552873902, "Kyrgyz");

        for (int i = 0; i < students.length; i++) {

            String dateString = students[i].getDataOfBirth();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate parsedDate = LocalDate.parse(dateString, formatter);

            LocalDate currentDate = LocalDate.now();

            Period period = Period.between(parsedDate, currentDate);

            System.out.println("Студент " + students[i].getName() + " нынешний возраст: " + period.getYears());
        }

    }
}
