import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // ArrayList = a resizeable array that stores objects(autoboxing).
        //            Arrays are fixed in size, but ArraysLists can change.


        Scanner scanner = new Scanner(System.in);


        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i =1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);

        }
        System.out.println(foods);

        scanner.close();




    }

}
