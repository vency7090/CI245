package HW3VENCYPATEL;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {}

    public int getSpeed() { return speed; }
    public boolean isOn() { return on; }
    public double getRadius() { return radius; }
    public String getColor() { return color; }

    public void setSpeed(int value) { this.speed = value; }
    public void setOn(boolean value) { this.on = value; }
    public void setRadius(double value) { this.radius = value; }
    public void setColor(String value) { this.color = value; }

    @Override
    public String toString() {
        if (on) {
            return "speed: " + speed + "\n" +
                   "color: " + color + "\n" +
                   "radius: " + radius + "\n" +
                   "fan is on";
        } else {
            return "color: " + color + "\n" +
                   "radius: " + radius + "\n" +
                   "fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println();
        System.out.println(fan2.toString());
    }
}