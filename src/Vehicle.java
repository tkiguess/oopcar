import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Vehicle {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);
        Tesla t = new Tesla();


        String garage="", tezla="";
        int x=0;



        while ( x <1 ){
            System.out.println("What up big boi welcome to leos garage. press y to enter:");
            garage =keyboard.next();

            if (garage.contains("y")){
                System.out.println ("welcome to my garage big boi. below is a list if the following cars I have avalable: ");
                tezla =keyboard.next();
                t.setColor(tezla);

                System.out.println ("you can write the car name and ask for specific properties like the color, top speed, model: ");

            }

            else System.out.println("cant escape, not now big boi press y");
        }

    }
}
