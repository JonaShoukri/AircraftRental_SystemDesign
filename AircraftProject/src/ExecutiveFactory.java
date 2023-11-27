public class ExecutiveFactory extends AbstractAircraftFactory{
    @Override
    Airplain createAirplain() {
        AirplaineEngineer ae = new AirplaineEngineer(new ExecutiveAirplainBuilder());
        ae.makeAirplain();
        return ae.getAirplain();
    }

    @Override
    Helicopter createHelicopter() {
        HelicopterEngineer he = new HelicopterEngineer(new ExecutiveHelicopterBuilder());
        he.makeHelicopter();
        return he.getHelicopter();
    }

}
