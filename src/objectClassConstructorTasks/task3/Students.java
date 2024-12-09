package objectClassConstructorTasks.task3;

public class Students {
    private String name;
    private String dataOfBirth;
    private int phoneNumber;
    private String nationality;

    public Students(String name, String dataOfBirth, int phoneNumber, String nationality) {
        this.name = name;
        this.dataOfBirth = dataOfBirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
