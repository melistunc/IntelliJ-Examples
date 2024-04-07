

public class car {
    dieselEngine engine;
    public car(){
        engine = new dieselEngine();
    }

    public void drive(){
        System.out.println(engine.start());
    }
}