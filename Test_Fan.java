package HW3VENCYPATEL;

public class Test_Fan {
	
	
	    public static void main(String[] args) {
	    	System.out.println("HW3 Problem 9.8 - Fan Class by Vency Patel");

	        // Fan 1 - FAST, radius 10, yellow, ON
	        Fan fan1 = new Fan();
	        fan1.setSpeed(Fan.FAST);
	        fan1.setRadius(10);
	        fan1.setColor("yellow");
	        fan1.setOn(true);

	        // Fan 2 - MEDIUM, radius 5, blue, OFF
	        Fan fan2 = new Fan();
	        fan2.setSpeed(Fan.MEDIUM);
	        fan2.setRadius(5);
	        fan2.setColor("blue");
	        fan2.setOn(false);

	        System.out.println("Fan 1: " + fan1.toString());
	        System.out.println("Fan 2: " + fan2.toString());
	    }
	}


