
public class RectIf extends MyFrame {

	public void run()  {
		
		
		int x=10;
		setColor(0,0,0);
		
		int i;
		for (i=0 ; i<20 ; i++) {
			if (i<10) {
				setColor(i*12,i*12,i*12);
			}
			else {
				setColor(240-i*12,240-i*12,240-i*12);
			}
			
				fillRect(x,80,10,x);
				x+=20;
				}
			}
			
		// TODO 自動生成されたメソッド・スタブ

	}

	

