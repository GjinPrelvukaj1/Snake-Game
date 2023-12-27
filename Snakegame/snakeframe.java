package Snakegame;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class snakeframe extends JFrame {
		snakeframe(){
			
			
			this.add(new snakepanel());
			this.setTitle("Snake Game");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			ImageIcon image1 = new ImageIcon("snake.jpg");
			this.setIconImage(image1.getImage());
			this.pack();
			this.setVisible(true);
			this.setLocationRelativeTo(null);
			
			
		}
}
