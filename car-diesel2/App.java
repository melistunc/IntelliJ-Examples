public class App 
{
    public static void main( String[] args )
    {
        Engine engine = new HyrdrogeneEngine();
        AutoCar car = new AutoCar(engine);
        car.drive();
    }
}