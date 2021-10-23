package ua.yaremechko.SOLID;

public class Main {

	public static void main(String[] args) {

		Su_27 su27 = new Su_27(100, 20, 11000, 900, "white");

		System.out.println(su27);

		System.out.println();

		su27.startEngine();

		System.out.println();

		su27.takeOff();

		System.out.println();

		su27.flyUp();

		System.out.println();

		su27.flyLeft();

		System.out.println();

		su27.flyDown();

		System.out.println();

		su27.flyRight();

		System.out.println();

		su27.stels();

		System.out.println();

		su27.nuclearStrike();

		System.out.println();

		su27.turbo();

		System.out.println();

		su27.landing();

	}

}
