
package patron_strategy_v1.Quack;


public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("QUACK QUACK QUACK");
    }
    
}
