import java.awt.Graphics;
import java.awt.Color;

public class Paddle {

    // Fields 
    int x; 
    int y; 
    int width = 10; // x 
    int length = 100; // y 

    // Constructor
    Paddle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(this.x, this.y, this.width, this.length);
    }

}
