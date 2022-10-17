import java.awt.*;

public class Ball {
    //position
	int x = 50;
	int y = 100;

    //ball velocity
	int dx = 3;
	int dy = 3;
	//dimensions
	int diameter = 20;

    Ball() {}

    Ball(int diameter) {
        this.diameter = diameter;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
		g.fillOval(x,y, diameter, diameter);
    }
}
