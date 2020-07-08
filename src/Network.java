package src;

import java.awt.Graphics;
import java.util.ArrayList;

public class Network {
    // Specify type of network in constructor
    public static final int RANDOM_NETWORK = 1;

    // All active nodes
    ArrayList<Node> network = new ArrayList<>();

    public Network(int networkType) {
        // Instantiate network
        switch(networkType) {
            case RANDOM_NETWORK:
                network = NetworkGenerator.genRandNetwork();
                break;
            default:
                System.out.println("Currently only support random networks");
                System.exit(1);
        }
    }

    public void paint(Graphics g) {
        // Paint nodes

        for(Node node: network) {
            node.paint(g);
        }
    }
}