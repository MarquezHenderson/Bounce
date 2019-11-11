import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class Ball extends JComponent {
	int x = 0;
	int y = 0;
	int vel = 3;
	int vely= 3;
	int width = 20;
	int height = 20;
	boolean isnotmoving;
	Color colorChange = Color.GREEN;
	Colors colors = new Colors();
	Graphics g;
	int clone = 0;
	ArrayList<Integer> keepCount = new ArrayList<Integer>(); 
	public Ball() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//This needs to come out and become a method I think 
		/*Graphics2D g2 = (Graphics2D) g;
		g2.setColor(colorChange);
		g2.fillOval(x, y, width, height);*/
		
		makeball(g, colorChange, x, y, width, height);
		//makeball(g, colorChange, x+clone, y+clone, width, height);
		
			
		
		
		
	}
	
	public void makeball(Graphics b, Color c, int x, int y, int width, int height){
		Graphics2D g2 = (Graphics2D) b;
		g2.setColor(c);
		g2.fillOval(x, y, width, height);
		
		
	}
	
	
	
	//this is where you could take in the arguments like the width of the frame
	public void move(JFrame frame) {
		//Write the logic to moving the ball here 
		if(x <= (frame.getWidth()-width)){
			x += 1;
			y += 1;
			if(x<= 0){
				vel = 3;
				// Left 
				//colorChange = Color.RED;
				colorChange = colors.change();
				clone=clone++;
				
			}
			
			
		    }
		else if(x >= (0-width)){
			
			
			vel = -3;
			//Right
			colorChange = colors.change();
			clone=clone+10;
			
			
		}
		if(y <= (frame.getHeight()-height-15)){
			y += 1;
			if(y<= 0){
				vely = 3;
				//Top
				colorChange = colors.change();
				clone++;
			}
			
		}
		else if(y >= 0-height){
			vely = -5;
			//Bottom
			colorChange = colors.change();
			clone++;
		}

		x = vel + x;
		y = vely + y;
		
		
	}
	class BallCaller implements ActionListener{
		int keepCount = clone;

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}

}