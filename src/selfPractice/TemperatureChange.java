/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 06-11-2020
 *   Time: 22:06
 *   File: TemperatureChange.java
 */

package selfPractice;

import java.util.Scanner;

public class TemperatureChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Temperature condition :: 1 for celsius or " +
                "2 for fahrenheit or 3 for kelvin -> ");
        int temperatureCondition = scanner.nextInt();
        if (temperatureCondition == 1) {
            System.out.print("Enter the temperature in Celsius : ");
            float temperatureInCelsius = scanner.nextFloat();
            float temperatureInFahrenheit = 9 * (temperatureInCelsius/5) + 32;
            float temperatureInKelvin = (float) (temperatureInCelsius + 273.15);
            System.out.println("Temperature in fahrenheit is " + temperatureInFahrenheit);
            System.out.println("Temperature in kelvin is " + temperatureInKelvin);
        }
        else if(temperatureCondition == 2) {
            System.out.print("Enter the temperature in Fahrenheit : ");
            float temperatureInFahrenheit = scanner.nextFloat();
            float temperatureInCelsius = (5/9) * (temperatureInFahrenheit-32);
            float temperatureInKelvin = (float) ((5/9) * (temperatureInFahrenheit-32) + (255.372));
            System.out.println("Temperature in celsius is " + temperatureInCelsius);
            System.out.println("Temperature in kelvin is " + temperatureInKelvin);
        }
        else {
            System.out.print("Enter the temperature in kelvin : ");
            float temperatureInKelvin = scanner.nextFloat();
            float temperatureInCelsius = (float) (temperatureInKelvin - 273.1);
            float temperatureInFahrenheit = (float) ((9/5) * (temperatureInKelvin - 273.15) + 32);
            System.out.println("Temperature in celsius is " + temperatureInCelsius);
            System.out.println("Temperature in fahrenheit is " + temperatureInFahrenheit);
        }
    }
}