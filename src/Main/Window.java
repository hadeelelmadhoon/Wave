package Main;

import javax.swing.*;
import java.awt.*;

public class Window extends Canvas{

    private static final long serialVersionUID = -6818686894060817625L;

    public Window(int width, int height, String title, Game game){
        JFrame frame = new JFrame(title); // creating window frame

        frame.setPreferredSize(new Dimension(width, height)); // setting dimensions of frame
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allows exit button to actually work
        frame.setResizable(false); // cannot resize game screen
        frame.setLocationRelativeTo(null); // window opens in the middle of the screen
        frame.add(game); // adding game class into frame
        frame.setVisible(true); // setting frame to visible so we can see it
        game.start(); // calling the start method in Game.java

    }

}