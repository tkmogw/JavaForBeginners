
public class DisplayFaceObject extends MyFrame {

	public void run() {
	//	Face face1=new Face(20,50);
	//	face1.draw(this);
	//	Face face2=new Face(220,50);
	//	face2.draw(this);
	//	Face face3=new Face(120,150);
	//	face3.draw(this);
		Face face1=new Face(50,50,10,5);
		Face face2=new Face(200,100,-10,-5);
		for(int i=0 ; i<30 ; i++)
		{
			
			clear();
			face1.draw(this);
			face2.draw(this);
			face1.move();
			face2.move();
			sleep(0.01);
		}
	}

}
