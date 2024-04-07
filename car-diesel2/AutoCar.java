public class AutoCar implements Car{
    Engine engine;

    public AutoCar (Engine engine){

        this.engine = engine;
    }
    @Override
    public void drive() {
        System.out.println(engine.start() );

    }
}