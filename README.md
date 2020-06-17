# Graphical Graph Traversal

Show a graph traversal in real time.

Using Java

## Tasks

- Generate a random network of nodes with connections
    - Tree network generation
    - Figure out ways of generating network besides tree network. Create more random connections with links that can occur across thew whole panel
- Create a target node
- Create algorithms to finds paths to the target node
- Graphical representation of algorithm working

*Optional*

- Config variables
    - Size of grid
    - Size of square
- User input for variables
    - Size of grid
    - Size of square

## Network Generation

*Generation of nodes*

- Start of with Grid
- Random positions of the grid will become a node.
    - 0.5 chance of node spawning
- Possible positions of nodes for 5 x 7

0000000
0N0N0N0
0000000
0N0N0N0
0000000

*Generation of random links*

- Iterate through all nodes and iterate through all other nodes and randomly link to each other node.
- With more links, the chance to link to other nodes decrease
    - Randomly choose the "other node" to ensure change doesn't decrease as we go down the list of "other nodes".

*Tree Network Links*

Stage 1: Vertical - Horizontal Links

- Develop hashcode for Position
- Create hashmap of Position -> Node entries to enumerate surrounding nodes for linking.

Stage 2: Include diagonal links

Stage 3: Remove nodes inbetween links to create longer links.
    - Result in less nodes
    - Optional at the moment


## Other ideas

Graph traversal game
- Maze like game
- When traversing, cover the other nodes.

Network traffic replication
- Packet intercept
- Replicate packets and the network layer
