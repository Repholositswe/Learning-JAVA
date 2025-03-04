import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //ternary operator ? = return 1 of 2 values if a condition is true

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        // (condition) ? true : false
        newtemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.2f", newtemp);




        scanner.close();
    }


}
