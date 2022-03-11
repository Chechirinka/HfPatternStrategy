import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;
import fly.FlyRocketPowered;

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