package src;

import java.util.ArrayList;
import java.util.Random;

class NetworkGenerator {
    // Grid size (I want these variables in a config file)
    public static final int NUM_SQUARES_HORIZONTAL = MyPanel.PANEL_WIDTH/Node.NODE_SIZE;
    public static final int NUM_SQUARES_VERTICAL = MyPanel.PANEL_HEIGHT/Node.NODE_SIZE;

    // Random Node generation
    private static Random rand = new Random();

    public static ArrayList<Node> genRandNetwork() {
        ArrayList<Node> network = new ArrayList<Node>();
        HashMap<Position,

        // *** Generate nodes ***

        // Instantiate nodes in grid with a spacing in between
        // If num squares horizontal is even then we have to decrement the last column index so last column doesn't have nodes
        int horizontalLimit = NUM_SQUARES_HORIZONTAL;
        int verticalLimit = NUM_SQUARES_VERTICAL;

        // Currently identified as redundant statement, but will be useful for user input grid size.
        if(NUM_SQUARES_HORIZONTAL % 2 == 0) { horizontalLimit -= 1; }
        if(NUM_SQUARES_VERTICAL % 2 == 0) { verticalLimit -= 1; }

        // Defining the positions of the nodes and which nodes will be active
        for(int y = 1; y < horizontalLimit; y += 2) {
            for(int x = 1; x < verticalLimit; x += 2) {
                // 0 - not active, 1 - active
                // Currently 50% chance for node to spawn
                int chanceGen = rand.nextInt(2);
                if(chanceGen == 1) {
                    // Add new Node to network
                    network.add(new Node(y*Node.NODE_SIZE,x*Node.NODE_SIZE, true));
                }
            }
        }

        // ** Generate connections **
        
        // Look around the node and see if there's any


        return network;
   } 
}