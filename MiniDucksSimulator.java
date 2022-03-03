import duckPackage.Duck;
import duckPackage.MallardDuck;
import duckPackage.ModelDuck;
import flyPackage.FlyRocketPowered;

public class MiniDucksSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.perfomQuack();
        mallard.perfomFly();

        Duck model = new ModelDuck();

        model.perfomFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.perfomFly();
    }
}