package adapter;

/**
 * 
 * @author eric_lu
 * user 認為他正跟企鵝溝通
 * 但實際是鴨子在工作
 * Adapter 委託工作給鴨子
 * 
 * In this type of adapter pattern, the adapter contains an instance of the class it wraps. In this situation, the adapter makes calls to the instance of the wrapped object.
 * 
 */
public class DuckAdapter_Object implements Penguin{

    Duck fakePenguin;
    
    public DuckAdapter_Object(Duck aDuck){
        this.fakePenguin = aDuck;
    }
    
    @Override
    public void Penguin_gobble() {
        fakePenguin.Duck_quack();
        System.out.println("Low voice");
    }

    @Override
    public void Penguin_walk() {
        fakePenguin.Duck_walk();
        System.out.println("Swing like a penguin");
    }

}
