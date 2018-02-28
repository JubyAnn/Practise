package Interface;

public class Bike {

	public Bike() {
		// TODO Auto-generated constructor stub
	}
	
	int gear;
	int speed;
	
	
	public void changeGear(int newGear)
	{
		gear = newGear;
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
		System.out.println("Speed = " +speed +" "  + "Gear =" +gear );
	}
	
}
