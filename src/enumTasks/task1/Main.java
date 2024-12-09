package enumTasks.task1;

public class Main {
    public static void main(String[] args) {

        region region = Main.region.BATKEN;

        switch (region) {
            case BATKEN:
                System.out.println("Capital of nasvay");
                break;
            case CHUY:
                System.out.println("In this region have the capital");
                break;
            case ISSUKKUL:
                System.out.println("The second lake in the world");
                break;
            case JALALABAD:
                System.out.println("Hz cho pisat");
                break;
            case NARYN:
                System.out.println("The best mountains in Kyrgyzstan");
                break;
            case OSH:
                System.out.println("City with regional significance");
                break;
            case TALAS:
                System.out.println("hz cho tam est");
                break;
            default:
                System.out.println("Enter the correct value");
                break;
        }

    }

    public enum region {
        BATKEN, CHUY, ISSUKKUL, JALALABAD, NARYN, OSH, TALAS;
    }
}
