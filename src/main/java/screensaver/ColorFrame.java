package screensaver;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class ColorFrame extends JFrame {

    public ColorFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace(){
        Random rand = new Random();
        setLocation(rand.nextInt(1200), rand.nextInt(700));
        getContentPane().setBackground(getColor());
        repaint();
    }

    protected abstract Color getColor();
}
