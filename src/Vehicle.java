public class Vehicle {
    private String color;
    private String model;
   // private String speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

  /*  public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }*/

    public String start(){
        return "the vehicle is starting.";
    }
    public String speed(){
        return "your cars fast enough dont worry.";
    }

}
