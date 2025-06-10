
public class Car extends Vehicle{

	public Car(int x,int y,int vx,int vy)
	{
		super(x,y,vx,vy);
		
	}
		public void draw(MyFrame frame) {
			frame.fillRect(x+10,y+20,50,30);
			frame.fillRect(x-20,y+50,110,30);
			frame.fillOval(x,y+79,25,25);
			frame.fillOval(x+50,y+79,25,25);
			// TODO 自動生成されたメソッド・スタブ

		}
		
		// TODO 自動生成されたメソッド・スタブ

	


	}


