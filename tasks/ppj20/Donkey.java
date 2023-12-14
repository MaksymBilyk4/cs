package ppj20;


public class Donkey {

    private Balloon[] balloons;
    private int mass;
    private double balloonGramSum = 0;

    public Donkey() {
        this.balloons = new Balloon[0];
        this.mass = (int) ((Math.random() * 80) + 20);
    }

    public void addBalloon(Balloon balloon) {
        Balloon[] copy = new Balloon[this.balloons.length + 1];

        if (this.balloons.length > 0) copy[copy.length - 1] = balloon;
        else copy[0] = balloon;

        for (int i = 0; i < this.balloons.length; i++) copy[i] = this.balloons[i];

        this.balloons = copy;
    }

    public boolean isFlying() {
        for (Balloon balloon : this.balloons) this.balloonGramSum += balloon.getLoad();

        return this.balloonGramSum / 1000.0 > mass;
    }

    public void makeDonkeyFly () {
        while (!this.isFlying()) {
            this.addBalloon(new Balloon());
        }
        double balloonKgSum = Math.round((this.balloonGramSum / 1000.0) * 100.0) / 100.0;
        this.balloonGramSum = Math.round((this.balloonGramSum) * 1000.0) / 1000.0;


        System.out.println("I am flying !!!!");
        System.out.println("Donkey with mass ---> " + this.mass);
        System.out.println("Number of Balloons ---> " + this.balloons.length);
        System.out.println("Balloons Grams --> " + this.balloonGramSum);
        System.out.println("Balloons Kgs --> " + balloonKgSum);
        this.isFlying();
    }
}
