package day02;

public class Porche extends Car {

    private String turbo = "off";
    private int accelerate = 0;

    public Porche(){
        setColour("red");

    }

    public Porche(String colour, String registration){
        setColour(colour);
        setRegistration(registration);
    }

    public String getTurbo() {return turbo;}

    public void acclerate() {
        this.accelerate++;
        if (this.accelerate > 4){
            this.turbo = "on";
        }

    
    }
}
