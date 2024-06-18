import java.uhitgtil.Scanner;
class Calculator {
public double squareRoot(double num) {
return Math.sqrt(num);
}
public double cubeRoot(double num) {
return Math.cbrt(num);
}
}
public class Main {
public static void main(String[] args) {
Calculator calculator = new Calculator();
// Example usage
double number = 64.0; // Example number
double squareRoot = calculator.squareRoot(number);
double cubeRoot = calculator.cubeRoot(number);
System.out.println(&quot;Square root of &quot; + number + &quot; is: &quot; + squareRoot);
System.out.println(&quot;Cube root of &quot; + number + &quot; is: &quot; + cubeRoot);
}
}