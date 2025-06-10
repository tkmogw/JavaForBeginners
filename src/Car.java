import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener{

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
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			if (e.getKeyCode()==KeyEvent.VK_LEFT)
			{
				vx=-5;
			}
			if (e.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				vx=5;
			}
			if (e.getKeyCode()==KeyEvent.VK_UP)
			{
				vy=-5;
			}
			if (e.getKeyCode()==KeyEvent.VK_DOWN)
			{
				vy=5;
			}
			if (e.getKeyCode()==KeyEvent.VK_A)
			{
				vx=-5;
			}
			if (e.getKeyCode()==KeyEvent.VK_D)
			{
				vx=5;
			}
			if (e.getKeyCode()==KeyEvent.VK_W)
			{
				vy=-5;
			}
			if (e.getKeyCode()==KeyEvent.VK_S)
			{
				vy=5;
			}
		}
			
	
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			vx=0;
			if (e.getKeyCode()==KeyEvent.VK_LEFT)
			{
				vx=0;
			}
			if (e.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				vx=0;
			}
			if (e.getKeyCode()==KeyEvent.VK_UP)
			{
				vy=0;
			}
			if (e.getKeyCode()==KeyEvent.VK_DOWN)
			{
				vy=0;
			}
			if (e.getKeyCode()==KeyEvent.VK_A)
			{
				vx=0;
			}
			if (e.getKeyCode()==KeyEvent.VK_D)
			{
				vx=0;
			}
			if (e.getKeyCode()==KeyEvent.VK_W)
			{
				vy=0;
			}
			if (e.getKeyCode()==KeyEvent.VK_S)
			{
				vy=0;
			}
		
		// TODO 自動生成されたメソッド・スタブ

	

		}
	}


