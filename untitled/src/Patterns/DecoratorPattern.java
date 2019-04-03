package Patterns;

public class DecoratorPattern {
    public static void main(String[] args) {
        Engine engine = new Avto();
        System.out.println("Price " + engine.getPrice() + "; " + "Description - " + engine.getDescription());
        engine = new HotRod(engine);
        System.out.println("Price " + engine.getPrice() + "; " + "Description - " + engine.getDescription());
        engine = new AvtoForDrag(engine);
        System.out.println("Price " + engine.getPrice() + "; " + "Description - " + engine.getDescription());
        engine = new Tractor(engine);
        System.out.println("Price " + engine.getPrice() + "; " + "Description - " + engine.getDescription());
    }
}
interface Engine{
    int getPrice();
    String getDescription();
}
class Avto implements Engine{

    @Override
    public int getPrice() {
        return 250000;
    }

    @Override
    public String getDescription() {
        return "engine for avto";
    }
}
abstract class AvtoDecorator implements Engine{
    public Engine engine;

    public AvtoDecorator(Engine engine) {
        this.engine = engine;
    }

    @Override
    public int getPrice() {
        return engine.getPrice();
    }

    @Override
    public String getDescription() {
        return engine.getDescription();
    }
}
class AvtoForDrag extends AvtoDecorator{
    public AvtoForDrag(Engine engine) {
        super(engine);
    }

    @Override
    public int getPrice() {
        return engine.getPrice() + 100000;
    }

    @Override
    public String getDescription() {
        return engine.getDescription() + " tuning accessories";
    }
}
class HotRod extends AvtoDecorator{
    public HotRod(Engine engine) {
        super(engine);
    }

    @Override
    public int getPrice() {
        return engine.getPrice() + 300000;
    }

    @Override
    public String getDescription() {
        return engine.getDescription() + " rarity";
    }
}
class Tractor extends AvtoDecorator{
    public Tractor(Engine engine) {
        super(engine);
    }

    @Override
    public int getPrice() {
        return engine.getPrice() - 100000;
    }

    @Override
    public String getDescription() {
        return engine.getDescription() + " so cheap, but so strong";
    }
}