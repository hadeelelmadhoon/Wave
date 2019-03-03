package Main;

import java.awt.*;

public class Game extends Canvas implements Runnable {

    private static final long serialVersionUID = -8440437466642782923L;
    public static final int WIDTH = 640, HEIGHT = WIDTH/12*9;

    public Game(){
        new Window(WIDTH, HEIGHT, "Wave", this);

    }
    public synchronized void start(){

    }

    public void run(){

    }

    public static void main(String[] args) {

        new Game(); // creating an instance of the game class, calling the constructor
    }
}