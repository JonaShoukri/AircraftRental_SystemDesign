public class ExecutiveHelicopterBuilder implements IHelicopterBuilder{
    private Helicopter helicopter;
    public ExecutiveHelicopterBuilder() {
        this.helicopter = new Helicopter();
    }
    @Override
    public void buildNumBlades() {
        this.helicopter.setNumBlades(6);
    }

    @Override
    public void buildMaxSpeed() {
        this.helicopter.setMaxSpeed(1000);
    }

    @Override
    public void buildNumSeats() {
        this.helicopter.setNumSeats(10);
    }

    @Override
    public void buildWeight() {
        this.helicopter.setWeight(1000);
    }

    @Override
    public void buildEngine() {
        this.helicopter.setEngine(EngineFactory.method(EngineType.Electric));
    }

    @Override
    public void buildVariant() {
        this.helicopter.setVariant(Variants.EXECUTIVE);
    }

    @Override
    public Helicopter getHelicopter() {
        return this.helicopter;
    }
}
