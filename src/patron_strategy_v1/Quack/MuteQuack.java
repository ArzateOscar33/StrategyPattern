
package patron_strategy_v1.Quack;


public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<<SILENCE>>");
    }
    
    
}
