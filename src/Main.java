import javax.swing.JFrame;



public class Main {


	public static void main(String[] args) {
		// TODO 
		//MakeWin win = new MakeWin("New window");
		//win.getWin();
		JFrame frame = new JFrame();
		Ball ball = new Ball();
		frame.setTitle("Bounce");
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(ball);
		//You could use condition here like while
		while(true){
			ball.move(frame);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ball.repaint();
			
		}
		

	}
	

}

