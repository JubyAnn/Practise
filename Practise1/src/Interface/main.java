package Interface;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle bi = new Bicycle();
		bi.applyBrakes(10);
		bi.changeGear(20);
		bi.speedUp(40);
		
		System.out.println("Data for bicycle");
		bi.printdata();
		
		
		Bike b = new Bike();
		b.applyBrakes(2);
		b.speedUp(4);
		b.changeGear(2);
		
		System.out.println("Data for bike");
		b.printdata();
		
		
		
		
	}

}
