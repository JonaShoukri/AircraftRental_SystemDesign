public class SimpletonFactory extends AbstractAircraftFactory{
    @Override
    Airplain createAirplain() {
        AirplaineEngineer ae = new AirplaineEngineer(new SimpletonAirplainBuilder());
        ae.makeAirplain();
        return ae.getAirplain();
    }

    @Override
    Helicopter createHelicopter() {
        HelicopterEngineer he = new HelicopterEngineer(new SimpletonHelicopterBuilder());
        he.makeHelicopter();
        return he.getHelicopter();
    }
}
