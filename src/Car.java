public class Car extends Vehicle{
//private String speed;
private String breaktimes;


    /*@Override
    public String getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(String speed) {
        this.speed = speed;
    }
*/
    public String getBreaktimes() {
        return breaktimes;
    }

    public void setBreaktimes(String breaktimes) {
        this.breaktimes = breaktimes;
    }

    @Override
    public String start() {
        return "car is starting big boi";
    }

    @Override
    public String speed() {
        return "cars going at 15 mph";
    }


}
