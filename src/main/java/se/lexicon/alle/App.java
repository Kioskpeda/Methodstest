package se.lexicon.alle;

//import java.awt.event.HierarchyBoundsAdapter;
//import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        printOut("name","bajs");
        printOut("age","25");

        double result =addition(10685.5,2949849.24);
        System.out.println(result);
        System.out.println(isAdult (18));

    }

    // Accessmodifier
    // Static or Instance
    // ReturnType
    // Name of method
    // Parameters
    // Method body
    // Method needs to be inside a class

     public static void name (){}



    public static void printOut(){
        System.out.println("Hello World! - From Method.");
    }

    public static void printOut(String what,String value){
        System.out.print("The " + what + " is:");
        System.out.println(value);



    }

    public static double addition( double number1, double number2){
        //preparing variables to be used in method.+

        double result;

        //Performs the action of what the method should be doing - Addition in this case.

        result = number1 + number2;

        //Returns the result of the calculation.
        System.out.println(result);
        return result;





    }

    public static boolean isAdult(int age){

        if(age >= 18){
            return true;
        }else{
            return false;
        }



    }



}