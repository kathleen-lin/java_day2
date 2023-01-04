package day02;

public class Car {

    //properties
    private String registration;
    private String colour;
    private int year;
    private boolean started;

    //set getters and setters
    public String getRegistration() { return this.registration;}
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;

    
    }

    public boolean isStarted() {
        return started;
    }
    ;

    //methods
    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public void getOutOfMyWay() {
        System.out.println("HONK....");
    }
        
    




}
