public class Main {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called()


        // overloaded methods = methods that share the same name, nut diff parameters
        // signature = name + parameters

        String pizza = bakePizza("flat bread", "cheddar", "pepperoni");
        System.out.println(pizza);


        }

        static String bakePizza(String bread){
        return bread + " pizza";
        }
        static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
    }



