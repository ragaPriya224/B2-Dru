package java8Demo;

public class Car implements VehicleInterface , FourWheelerInterf{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleInterface.doSound();
	}
	public void doPrint(){
		//		System.out.println("I'm from vehicle ,4wheeler ");
		VehicleInterface.super.doPrint();

	}

}
