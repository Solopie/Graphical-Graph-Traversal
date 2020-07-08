package src;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;


class MyPanel extends JPanel {
    // Public to calculate the size of grid
    public static final int PANEL_WIDTH = 500;
    public static final int PANEL_HEIGHT = 500;

    // Network
    public Network grid = new Network(Network.RANDOM_NETWORK);

    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(PANEL_WIDTH,PANEL_HEIGHT);
    }

    @Override
    public void paintComponent(Graphics g) {
        // Paints the background first since component is opaque
        super.paintComponent(g);

        // Paint Network
        grid.paint(g);

    }
}
