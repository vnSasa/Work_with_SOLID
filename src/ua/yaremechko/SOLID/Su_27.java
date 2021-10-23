package ua.yaremechko.SOLID;

public class Su_27 extends PlaneControls implements Special {

	public int maxSpeed;
	public String color;
	
	public Su_27(double length, double width, double weight, int maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void turbo() {
		System.out.println("Turbo acceleration is enabled. Airplane speed " + (Math.random()*maxSpeed+maxSpeed) + " km/h");
	}

	@Override
	public void stels() {
		System.out.println("Stealth technology is enabled. The plane is invisible for " + Math.random()*6 + " minutes");
	}

	@Override
	public void nuclearStrike() {
		System.out.println("Reset of " + (int)(1+Math.random()*11) + " nuclear warheads");
	}

	@Override
	public String toString() {
		return "Su_27 [maxSpeed=" + maxSpeed + " km/h, color=" + color + ", " + super.toString() + "]";
	}

}
