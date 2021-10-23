package ua.yaremechko.SOLID;

public abstract class Plane {

	double length;
	double width;
	double weight;

	public Plane(double length, double width, double weight) {
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void startEngine() {
		System.out.println("start the engines in " + ((int) Math.random() * 68 + 20) + " minutes");
	}

	public void takeOff() {
		System.out.println("plane takeoff in " + (Math.random() * 1001) + " kilometers");
	}

	public void landing() {
		System.out.println("plane landing");
	}

	@Override
	public String toString() {
		return "length=" + length + " meters, width=" + width + " meters, weight=" + weight + " kilograms";
	}

}
