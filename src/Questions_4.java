import java.util.Scanner;

public class Questions_4 {
    public static void main(String[] args) {
//Celsius to Fahrenheit
//You are making a Celsius to Fahrenheit converter.
//Write a function to take the Celsius value as an argument and return the corresponding Fahrenheit value.
//Sample Input
//36
//Sample Output
//96.8
//The following equation is used to calculate the Fahrenheit value: 9/5 * celsius + 32
        double Celcius, Fahrenheit;
        // Fahrenheit value: 9/5 * celsius + 32
        Scanner girdi = new Scanner(System.in);
        System.out.println("Hava kaç derece :");
        Celcius = girdi.nextInt();
        Fahrenheit = 9/5 * Celcius + 32;
        System.out.println("Havanın Fahrenheit değeri :" +Fahrenheit);

    }


}
