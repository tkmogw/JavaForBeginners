import java.util.Vector;

public class DisplayCarVector  extends MyFrame {

	public void run() {
		Vector<Car> cars=new Vector<Car>();
		
		for (int x =0;x < 30; x++)
		{
		cars.add(new Car(10,10,1+(2*x),0));
		
		cars.add(new Car(10,90,2+(2*x),0));
		
		cars.add(new Car(10,170,3+(2*x),0));
		
		cars.add(new Car(10,250,4+(2*x),0));
		
		cars.add(new Car(10,330,5+(2*x),0));
		//40,80
		for(int i=0 ; i<=50; i++)
		{
			
			clear();
		for(int j=0; j<cars.size(); j++) 
		    {
			cars.get(j).draw(this);
			cars.get(j).move();
			
			}
		
		
			sleep(0.01);
			//if(i==30) {
		//		cars.remove(4);
		//		cars.add(new Car(0,325,n,0));
			}
		// TODO 自動生成されたメソッド・スタブ
cars.clear();
	}
	}
}
