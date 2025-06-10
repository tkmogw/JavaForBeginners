
public class Vehicle {
	int x,y,vx,vy;
	public Vehicle(int x,int y,int vx,int vy)
	   {
		   this.x=x;
		   this.y=y;
		   this.vx=vx;
		   this.vy=vy;
	   }
	
	public void move(MyFrame frame) {
		x+=vx;
		y+=vy;
		
		 int width = frame.getWidth(); // フレームの幅を取得するのじゃ

	        if (x > width) {
	            x -= width;
	        } else if (x < 0) {
	            x += width;}
	        }
	//	else if(x>=width)
	//	{
		//	x=0;
		//}
		public void draw(MyFrame frame)
		{
		
		}

}
