package frames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);  // sets the x-dimension and y-dimension of the frame
        this.setVisible(true); // make the frame visible

        ImageIcon image = new ImageIcon("C:\\Users\\wwwiv\\Desktop\\logo.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123, 50, 250));
    }
}
