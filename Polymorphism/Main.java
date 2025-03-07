public class Main {
    public static void main(String[] args){

        // Polymorphism = "Poly" = "Many"
        //                 "Morph" = "Shape"
        //                 Objects can identify as other objects
        //                 Objects can be treated as objects of a common superclass.


        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

        Vehicle [] vehicles = {car,boat,bike};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }

}
