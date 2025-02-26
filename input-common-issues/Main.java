import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

       //Common Issues

       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        //solve the problem by lin 13when you encounter the int problem
        scanner.nextLine();

       System.out.print("Enter your favourite color: ");
       String color = scanner.nextLine();

       System.out.println("You are " + age + " years old");
       System.out.println("You like the color " + color);
       scanner.close();
   }
}
