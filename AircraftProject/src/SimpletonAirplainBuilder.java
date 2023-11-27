public class SimpletonAirplainBuilder implements IAirplainBuilder {
    private Airplain airplain;

    public SimpletonAirplainBuilder() {
        this.airplain = new Airplain();
    }

    public void buildEngine() {
        this.airplain.setEngine(EngineFactory.method(EngineType.Gas));
    }

    public void buildeWings() {
        this.airplain.setWingSpan(25);
    }

    public void buildSeats() {
        this.airplain.setNumSeats(10);
    }

    public void buidMaxSpeed() {
        this.airplain.setMaxSpeed(100);
    }

    @Override
    public void buildVariant() {
        airplain.setVariant(Variants.SIMPLETON);
    }

    public Airplain getAirplain() {
        return this.airplain;
    }
}
