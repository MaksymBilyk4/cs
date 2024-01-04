package ppj23.task2;

public class Main {

    public static void main(String[] args) {

        SmokeDetector smokeDetector = new SmokeDetector();

        try {
            System.out.println("Try - 1");
            smokeDetector.checkIsSmoke();
            smokeDetector.setSmoke(true);
            System.out.println("Try - 2");
            smokeDetector.checkIsSmoke();
        }catch (Alarm ex) {
            System.out.println(ex.getMessage());
        }

    }

}
