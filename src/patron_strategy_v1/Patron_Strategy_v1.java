
package patron_strategy_v1;
import Swim.SwimForward;
import Swim.SwimLeft;
import Swim.SwimRight;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import patron_strategy_v1.Ducks.DecoyDuck;
import patron_strategy_v1.Ducks.Duck;
import patron_strategy_v1.Ducks.MallardDuck;
import patron_strategy_v1.Ducks.ModelDuck;
import patron_strategy_v1.Ducks.RedHeadDuck;
import patron_strategy_v1.Ducks.RubberDuck;
import patron_strategy_v1.Fly.FlyNoWay;
import patron_strategy_v1.Fly.FlyWithRockets;
import patron_strategy_v1.Fly.FlyWithWings;
import patron_strategy_v1.Quack.MuteQuack;
import patron_strategy_v1.Quack.Quack;
import patron_strategy_v1.Quack.Squeak;

public class Patron_Strategy_v1 {

   
    public static void main(String[] args) {
        
        //Creamos las variables necesarias
     
        // TODO code application logic here
   
        menu();
        
        
        
    }//main
    public static void menu (){
        int x ;
        
        Duck duck;
        Scanner leer = new Scanner(System.in);
        do{
       //limpiarPantalla();
        System.out.println("MENU");
        System.out.println("Selecciona un Pato");
        System.out.println("1) Mallard Duck");
        System.out.println("2) Red Head Duck");
        System.out.println("3) Decoy Duck");
        System.out.println("4) Model Duck");
        System.out.println("5) Rubber Duck");
        System.out.println("0) SALIR");
        System.out.println("Seleccion : ");
        x=leer.nextInt();//leemos la variable   
        
        //creamos el switch
        switch(x){
            case 1:
                //Mallar Duck
                duck= new MallardDuck();
                Despliegue(duck);
             break;
             
            case 2:
                //Red Head Duck
                duck= new RedHeadDuck();
                Despliegue(duck);
             break;
             
            case 3:
                //Decoy Duck
                duck= new DecoyDuck();
                Despliegue(duck);
             break;
             
            case 4:
                //Model Duck
                duck= new ModelDuck();
                Despliegue(duck);
             break;
             
            case 5:
                //Rubber Duck
                duck= new RubberDuck();
                Despliegue(duck);
             break;
            default:
                
                 
                System.out.println("Seleccione una opcion correcta");
                System.out.println("Presione una tecla para regresar");
                //NOTA AGREGAR CONSOLE RED KEY PERO EN JAVA
            
               // System.out.print("\033[H\033[2J");
                //System.out.flush();
            break;
            case 0:
                System.exit(0);
        
        }//switch
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }//do
     while(x!=0);
        System.out.println("Programa Finalizado Correctamente");
    }//menu
    
    
    public static void Despliegue(Duck duck){
        int i;    
        int x;
        int y;
        try{
        do{
        limpiarPantalla();
        System.out.println("Menu Comportamiento del Pato ");
        System.out.println("1) Volar");
        System.out.println("2) Graznar");
        System.out.println("3) Nadar");
        System.out.println("Seleccione una Opcion");
        Scanner leer = new Scanner(System.in);
        x=leer.nextInt();//leemos la variable  
       switch(x){
            //caso Volar
            case 1:
                System.out.println("Menu Comportamiento para Volar");
                System.out.println("1)Fly With Wings");
                System.out.println("2)Fly no Way");
                System.out.println("3)Fly with Rockets");
                System.out.println("Seleccione una opcion : ");
                y=leer.nextInt();//leemos la opcion 
                    switch(y){
                        case 1:
                        duck.flyBehavior=new FlyWithWings();
                        break;
                        case 2:
                        duck.flyBehavior=new FlyNoWay();
                        break;
                        case 3:
                        duck.flyBehavior=new FlyWithRockets();
                        break;
                        default:
                        System.out.println("Seleccione una opcion correcta");
                        System.out.println("Presione una tecla para regresar");
                        break; 
                            }//segundo switch 
            case 2:
                System.out.println("Menu Comportamiento para Graznar");
                System.out.println("1)Squeak");
                System.out.println("2)Mute");
                System.out.println("3)Quack");
                System.out.println("Seleccione una opcion : ");
                y=leer.nextInt();//leemos la opcion 
                    switch(y){
                        case 1:
                            duck.quackBehavior= new Squeak();
                            break;
                        case 2:
                            duck.quackBehavior= new MuteQuack();
                            break;
                        case 3:
                            duck.quackBehavior= new Quack();
                        default:
                            System.out.println("Seleccione una opcion correcta");
                            System.out.println("Presione una tecla para regresar"); 
                    }//tercer switch
            
            case 3:
                
                System.out.println("Menu Comportamiento para Nadar");
                System.out.println("1)Swim Forward");
                System.out.println("2)Swim to the Left");
                System.out.println("3)Swim to the right");
                System.out.println("Seleccione una opcion : ");
                y=leer.nextInt();//leemos la opcion 
                switch(y){
                    case 1:
                        duck.swimBehavior= new SwimForward();
                        break;
                    case 2:
                        duck.swimBehavior= new SwimLeft();
                        break;
                    case 3:
                        duck.swimBehavior= new SwimRight();
                        break;
                    default:
                   // System.out.println("<<Seleccione una opcion correcta>>");
                    //System.out.println("<<Presione una tecla para regresar>>"); 
                }//cuarto switch
            
            
            
            
            
            
            
            
            
            
            
            
            default:
           // System.out.println("Seleccione una opcion correcta");
           // System.out.println("Presione una tecla para regresar");    
        }//switch*/
       
       
       
  
     
        limpiarPantalla();
        System.out.println("La Especie Seleccionada es ");
        duck.display();
        System.out.println("Comportamiento al volar es : ");
        duck.performFly();
        System.out.println("Comportamiento al Graznar es : ");
        duck.performQuack();
        System.out.println("Comportamiento al Nadar es : ");
        duck.performSwim();
        //preguntamos si quiere cambiar el comportamiento del pato
            System.out.println("¿Desea cambiar de nuevo el comportamiento del pato?");
            System.out.println("1) Si");
            System.out.println("0) No");
            i=leer.nextInt();//leemos la opcion 
        }//do   
        while(i!=0);
        }catch( Exception e){
            System.out.println("Error ,elija una opcion correcta");
        }
    }
    public static void limpiarPantalla(){
         int lineasAClear = 9;

        // Imprimir líneas en blanco para simular la limpieza
        for (int a = 0; a < lineasAClear; a++) {
            System.out.println();}//for1
    }
}//class
