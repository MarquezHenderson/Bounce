import java.awt.Color;
import java.util.Random;

/**
 * 
 */

/**
 * @author Marquez
 *
 */
public class Colors {
	
	Color[] colors = new Color[]{Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED,Color.MAGENTA};
	Random r = new Random();
	
	public Color change(){
		return colors[r.nextInt(colors.length)];
	}

}
