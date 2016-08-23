package adapter;

// https://dotblogs.com.tw/pin0513/2010/05/30/15497
/*
 * 不改變界面，加入責任
 * collection 中的 elements方法
 
 我們知道，轉接器模式是透過介面的包裝，讓兩個素不相往來的物件開始友好的一個模式！

最棒的是，這種介面的使用上，他不用修改舊物件的程式碼就可以達到這樣的效益。

其實「表象模式」是另一個，透過改變介面的模式！只是，表象模式想這麼做的理由，是為了要簡化介面

表象簡化界面  轉換器轉換界面

 */
public class Main {

	public static void main(String[] args) {
	    
         Duck aDuck = new MallardDuck();
         System.out.println("=== A Duck ===");
         aDuck.Duck_quack();
         aDuck.Duck_walk();
         aDuck.Duck_fly();
         System.out.println();
         
         Penguin aPenguin = new KingPenguin();
         System.out.println("=== A Penguin ===");
         aPenguin.Penguin_gobble();
         aPenguin.Penguin_walk();
         System.out.println();
         
         System.out.println("*** Object Adapter ***\n");
         
         Penguin aFakePenguin = new DuckAdapter_Object(aDuck); //aDuck -> penguin
         System.out.println("=== A Fake Penguin ===");
         aFakePenguin.Penguin_gobble();
         aFakePenguin.Penguin_walk();
         
         System.out.println("\n*** Class adapter ***");
         
         Adapter_Class anotherFakePenguin = new Adapter_Class();
         System.out.println("=== Another Fake Penguin ===");
         anotherFakePenguin.Penguin_gobble();
         anotherFakePenguin.Penguin_walk();
         
	}

}
