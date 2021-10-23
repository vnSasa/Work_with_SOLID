package ua.yaremechko.SOLID;

public class PlaneControls extends Plane {

	public PlaneControls(double length, double width, double weight) {
		super(length, width, weight);
	}

	public void flyUp() {
		System.out.println("Plane flying up to " + Math.random()*100 + " kilometers");
	}
	
	public void flyDown() {
		System.out.println("Plane flying down to " + Math.random()*100 + " kilometers");
	}
	
	public void flyLeft() {
		System.out.println("Plane flying left to " + Math.random()*100 + " kilometers");
	}
	
	public void flyRight() {
		System.out.println("Plane flying right to " + Math.random()*100 + " kilometers");
	}

	@Override
	public String toString() {
		return  super.toString();
	}
	
}
