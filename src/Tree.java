
public class Tree {

	int x,y,vx,vy;
	   public Tree(int x,int y,int vx,int vy)
	   {
		   this.x=x;
		   this.y=y;
		   this.vx=vx;
		   this.vy=vy;
	   }
		public void draw(MyFrame frame) {
			frame.fillOval(x,y,50,50);
			frame.fillRect(x+20,y+20,10,100);
			// TODO 自動生成されたメソッド・スタブ

		}
		public void move() {
			x+=vx;
			y+=vy;
		}
		// TODO 自動生成されたメソッド・スタブ

	}


