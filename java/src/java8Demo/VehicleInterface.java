package java8Demo;

public interface VehicleInterface {

	default void doPrint() {
		System.out.println("I'm from vehicle interface ");
	}
	static void doSound() {
		System.out.println("GRRRRR");
	}
	
}
