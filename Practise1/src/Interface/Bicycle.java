package Interface;

public class Bicycle implements Vehicle {

	int speed;
	int gear;
	
	public Bicycle() {
		// TODO Auto-generated constructor stub
	}

	public void changeGear(int newGear)
	{
		gear = newGear ;
	}
	
	public void speedUp(int increment)
	{
		 speed = speed + increment;
	}
	
	public void applyBrakes(int decrement)
	{
		speed = speed - decrement;
	}
	
	public void printdata()
	{
		System.out.println("Speed =" +speed   +" " + "Gear =" +gear );
	}
	
	
}
