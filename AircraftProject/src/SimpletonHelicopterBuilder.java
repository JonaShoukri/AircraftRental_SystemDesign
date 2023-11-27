public class SimpletonHelicopterBuilder implements IHelicopterBuilder{
    private Helicopter helicopter;

    public SimpletonHelicopterBuilder() {
        this.helicopter = new Helicopter();
    }
    @Override
    public void buildNumBlades() {
        this.helicopter.setNumBlades(4);
    }

    @Override
    public void buildMaxSpeed() {
        this.helicopter.setMaxSpeed(100);
    }

    @Override
    public void buildNumSeats() {
        this.helicopter.setNumSeats(4);
    }

    @Override
    public void buildWeight() {
        this.helicopter.setWeight(100);
    }

    @Override
    public void buildEngine() {
        this.helicopter.setEngine(EngineFactory.method(EngineType.Gas));
    }

    @Override
    public void buildVariant() {
        this.helicopter.setVariant(Variants.SIMPLETON);
    }

    @Override
    public Helicopter getHelicopter() {
        return this.helicopter;
    }
}
