import java.util.Vector;

public class DisplayVehicleVector extends MyFrame {

	public void run() {
		Vector<Vehicle> vehicles=new Vector<Vehicle>();
		
	//	for (int x =0;x < 30; x++)
		{
		vehicles.add(new Car(10,30,3,0));
		vehicles.add(new Car(100,100,-3,0));
		vehicles.add(new Train(200,200,5,0));
		vehicles.add(new Train(100,250,-5,0));
		vehicles.add(new Truck(10,280,7,0));
		vehicles.add(new Truck(200,340,7,0));
	
		//for (int i=0; i<5000; i++)
		while(true)
		{
			
			clear();
			for(int j=0; j<vehicles.size(); j++) 
			{
			vehicles.get(j).draw(this);	
			vehicles.get(j).move(this);	
			
			
			}
			sleep(0.01);
		}
		
		//vehicles.clear();
		}
	}

}
