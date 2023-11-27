public class PresidentialAirplainBuilder implements IAirplainBuilder {
    private Airplain airplain;

    public PresidentialAirplainBuilder() {
        this.airplain = new Airplain();
    }

    public void buildEngine() {
        this.airplain.setEngine(EngineFactory.method(EngineType.Gas));
    }

    public void buildeWings() {
        this.airplain.setWingSpan(100);
    }

    public void buildSeats() {
        this.airplain.setNumSeats(400);
    }

    public void buidMaxSpeed() {
        this.airplain.setMaxSpeed(10000);
    }

    @Override
    public void buildVariant() {
        this.airplain.setVariant(Variants.PRESIDENTIAL);
    }

    public Airplain getAirplain() {
        return this.airplain;
    }
}
