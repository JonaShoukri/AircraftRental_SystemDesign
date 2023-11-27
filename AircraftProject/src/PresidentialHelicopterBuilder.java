public class PresidentialHelicopterBuilder implements IHelicopterBuilder{
    private Helicopter helicopter;

    public PresidentialHelicopterBuilder() {
        this.helicopter = new Helicopter();
    }
    @Override
    public void buildNumBlades() {
        this.helicopter.setNumBlades(8);
    }

    @Override
    public void buildMaxSpeed() {
        this.helicopter.setMaxSpeed(10000);
    }

    @Override
    public void buildNumSeats() {
        this.helicopter.setNumSeats(20);
    }

    @Override
    public void buildWeight() {
        this.helicopter.setWeight(10000);
    }

    @Override
    public void buildEngine() {
        this.helicopter.setEngine(EngineFactory.method(EngineType.Gas));
    }

    @Override
    public void buildVariant() {
        this.helicopter.setVariant(Variants.PRESIDENTIAL);
    }

    @Override
    public Helicopter getHelicopter() {
        return this.helicopter;
    }
}
