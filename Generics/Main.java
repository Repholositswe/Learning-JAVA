public class Main {
    public static void main(String[] args){

    //Box<String> box = new Box<>();

    //box.setItem("banana");

        // System.out.println(box.getItem());


        Product<String, Double> product1 = new Product<>("apple", 10.3);
        Product<String, Integer> product2 = new Product<>("ticket", 12);

        System.out.println(product1.getPrice());
        System.out.println(product2.getPrice());
    }
}
