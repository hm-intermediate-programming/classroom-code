import javax.swing.*;
/** 
 * Irene Feng
 * Multi-class Files - MiniLab
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Find the bug and fix the program!");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        MyPongPanel panel = new MyPongPanel();
        frame.add(panel);
        
        frame.setSize(500,500);
		frame.setVisible(true);

        panel.play();

    }
}