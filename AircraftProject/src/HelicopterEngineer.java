public class HelicopterEngineer {
    private IHelicopterBuilder builder;

    public HelicopterEngineer(IHelicopterBuilder builder) {
        this.builder = builder;
    }

    public Helicopter getHelicopter() {
        return this.builder.getHelicopter();
    }

    public void
    makeHelicopter() {
        this.builder.buildNumBlades();
        this.builder.buildVariant();
        this.builder.buildMaxSpeed();
        this.builder.buildNumSeats();
        this.builder.buildWeight();
        this.builder.buildEngine();
    }
}
