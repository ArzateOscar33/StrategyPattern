
package patron_strategy_v1.Ducks;

import patron_strategy_v1.Fly.FlyBehavior;
import patron_strategy_v1.Quack.QuackBehavior;
import Swim.SwimBehavior;


public  abstract class Duck {
    //creamos las dos referencias a nuestras interfaces, en este caso son 3 FlyBheavior,QuackBehavior y SwimBehavior
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public SwimBehavior swimBehavior;
    
    //creamos el constructor
    
    public Duck() {
    }

    //creamos los metodos del pato
    
    public abstract void display();//metodo para desplegar 
    
    public void performFly(){
        flyBehavior.fly();//delegamos para la clase de comportamiento(en este caso Behavior fly)
    }
    public void performSwim(){
        swimBehavior.swim();//delegamos para la clase de comportamiento(en este caso Swim fly)
    }
    public void performQuack(){
        quackBehavior.quack();//delegamos para la clase de comportamiento(en este caso Swim fly)
    }
}
