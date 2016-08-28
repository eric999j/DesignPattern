package structural.adapter;

public class MallardDuck implements Duck {

    @Override
    public void Duck_quack() {
        System.out.println("MallardDuck_gobble");
    }

    @Override
    public void Duck_walk() {
        System.out.println("MallardDuck_walk");
    }
    
    @Override
    public void Duck_fly() {
        System.out.println("MallardDuck_fly");
    }

}
