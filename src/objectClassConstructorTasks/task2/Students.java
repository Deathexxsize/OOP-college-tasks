package objectClassConstructorTasks.task2;

public class Students {
    private String nane;
    private int age;
    private String group;

    public Students(String nane, int age, String group) {
        this.nane = nane;
        this.age = age;
        this.group = group;
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
