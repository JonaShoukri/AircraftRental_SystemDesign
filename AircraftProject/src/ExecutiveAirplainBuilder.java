public class ExecutiveAirplainBuilder implements IAirplainBuilder {
    private Airplain airplain;

    public ExecutiveAirplainBuilder() {
        this.airplain = new Airplain();
    }

    public void buildEngine() {
        this.airplain.setEngine(EngineFactory.method(EngineType.Electric));
    }

    public void buildeWings() {
        this.airplain.setWingSpan(50);
    }

    public void buildSeats() {
        this.airplain.setNumSeats(50);
    }

    public void buidMaxSpeed() {
        this.airplain.setMaxSpeed(1000);
    }

    @Override
    public void buildVariant() {
        this.airplain.setVariant(Variants.EXECUTIVE);
    }

    public Airplain getAirplain() {
        return this.airplain;
    }
}
