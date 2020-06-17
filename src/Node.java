package src;

import java.awt.Graphics;
import java.awt.Color;

class Node {
    // Ensure node size divides panel height and width
    public static final int NODE_SIZE = 20;
    // Make the circles abit smaller than the square
    private static final int OFFSET = 10;

    boolean status;
    int x,y;

    public Node(int x, int y, boolean status) {
        this.x = x;
        this.y = y;
        this.status = status;
    }

    public void paint(Graphics g) {
        // Paint circle for node
        g.setColor(Color.black);
        g.fillOval(x + OFFSET/2, y + OFFSET/2, NODE_SIZE - OFFSET, NODE_SIZE - OFFSET);
        g.drawOval(x + OFFSET/2, y + OFFSET/2, NODE_SIZE - OFFSET, NODE_SIZE - OFFSET);

        // Draw square outline
        g.drawRect(x, y, NODE_SIZE, NODE_SIZE);
    }
}