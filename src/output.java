import java.util.Scanner;

public class output {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);
        Vehicle v = new Vehicle();
        System.out.println(v.start());

        Car c = new Car();
        System.out.println(c.start());


        String color="", tezla="";

        System.out.println(v.speed());
        System.out.println(c.speed());

        //System.out.println("set your car color");
        tezla = keyboard.next();
        c.setColor(tezla);
        System.out.println("your car is " + c.getColor() + " now.");


        System.out.println("set your car model");
        tezla = keyboard.next();
        c.setModel(tezla);
        System.out.println("your cars is a" + c.getModel() + " now.");


        System.out.println("set your car speed");
        tezla = keyboard.next();
        /*c.setSpeed(tezla);
        System.out.println("your car is at " + c.getSpeed() + " mph.");*/


        System.out.println("wanna know how many clowns are in your car");
        tezla = keyboard.next();
        c.setBreaktimes(tezla);
        System.out.println("you have " + c.getBreaktimes() + " clowns in your car.");


        // 1. create a car object
        // 2. demonstrate inheritancy by calling speed and color to your new car object
        // THIS MEANS: do not create a vehicle object, set speed and color to the car




        /*while ( x <1 ){
            System.out.println("What up big boi welcome to leos garage. press y to enter:");
            garage =keyboard.next();

            if (garage.contains("y")){
                System.out.println ("welcome to my garage big boi. below is a list if the following cars I have available: ");




                System.out.println ("you can write the car name and ask for specific properties like the color, top speed, model: ");

            }

            else System.out.println("cant escape, not now big boi press y");
        }
*/
    }

}
