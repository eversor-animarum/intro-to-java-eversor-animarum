import java.util.Scanner;

// This program converts temp to either Celsius or Fahrenheit, based on the user's preference.
    public class TemperatureConverter{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Outlining the task to be performed
        System.out.println("Which temperature scale do you prefer?");
        System.out.println("\n a. Converting Celsius to Fahrenheit");
        System.out.println("\n b. Converting Fahrenheit to Celsius");
        System.out.println("\nInput either 'a' or 'b'");

        String tempp = scan.nextLine();

        // This line of code ensures that the input is correct
        if (tempp.isEmpty() || !tempp.matches("[ab]")) {
            System.out.println("Input is invalid/n");
             System.out.println ("Enter either 'a' or 'b'");
        }

 // A line of code to perform the task when 'a' is chosen.
        if (tempp.matches("a")) {
            System.out.println("Input the value to be converted into degrees Fahrenheit:");

    //I am laying down the calculation for option 'a'.
            double cel = scan.nextDouble();
            double far = (cel * 9 / 5) + 32;
            System.out.println("The temperature is " + far + " degrees Fahrenheit");
        }

        // To implement the conversion if option 'b' is chosen.
        while (tempp.matches("b")) {
            System.out.println("Input the value to be converted into degrees Celsius:");

             //I am laying down the calculation for option 'b'.
            double far = scan.nextDouble();
            double cel = (far - 32) * 5 / 9;
            System.out.println("The temperature is " + cel + " degrees Celsius");
            

        }

        scan.close();
    }
}
