package structural.adapter;

/*
 * 
 * This type of adapter uses multiple polymorphic interfaces to achieve its goal. The adapter is created by implementing or inheriting both the interface that is expected and the interface that is pre-existing.
 * 
 *
 */

public class Adapter_Class implements Duck,Penguin{

    @Override
    public void Duck_quack() {
        System.out.println("Duck_quack");
    }

    @Override
    public void Duck_walk() {
        System.out.println("Duck_walk");
    }

    @Override
    public void Duck_fly() {
        System.out.println("Duck_fly");
    }

    @Override
    public void Penguin_gobble() {
        System.out.println("Penguin_gobble");
    }

    @Override
    public void Penguin_walk() {
        System.out.println("Penguin_walk");
    }

}
