package day02;

public class CarMain {
    //this uses the object, needs an entry point
    public static void main(String[] args) {
        //instsntiate an instance of car
        Car c = new Car();
        c.setColour("Grey");
        c.setRegistration("sn2104");
        c.start();
        System.out.printf("Is the car started? %b\n", c.isStarted());

        c.getOutOfMyWay();

        Car d = new Car();
        d. setColour("red");
        System.out.printf("Color of car c is %s; Color of car d id %s\n", c.getColour(), d.getColour());
    }
}
