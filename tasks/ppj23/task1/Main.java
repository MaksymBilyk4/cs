package ppj23.task1;

public class Main {

    public static void main(String[] args) {

        Rocket rocket = new Rocket("Rocket One");
        rocket.refuel();

        try {
            rocket.start();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fuel ---> " + rocket.getWeightFuel());
        }

    }

}
