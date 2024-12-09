package objectClassConstructorTasks.task1;

public class Passport {
    private int id;
    private String firstName;
    private String lastName;
    private String yearOfBirth;
    private String countryOfBirth;

    public Passport(int id, String firstName, String lastName, String yearOfBirth, String countryOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.countryOfBirth = countryOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public void printInfo() {
        System.out.println("id: " + this.id);
        System.out.println("first name: " + this.firstName);
        System.out.println("last name: " + this.lastName);
        System.out.println("year of birth: " + this.yearOfBirth);
        System.out.println("country of birth: " + this.countryOfBirth);
    }
}
