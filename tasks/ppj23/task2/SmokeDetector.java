package ppj23.task2;

public class SmokeDetector {

    private boolean smoke;

    public SmokeDetector() {
        this.smoke = false;
    }

    public void checkIsSmoke () throws Alarm{
        if (this.smoke) throw new Alarm("Alarm!!! Smoke detected");
        System.out.println("Everything is ok. No smoke");
    }

    public boolean isSmoke() {
        return smoke;
    }

    public void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }
}
