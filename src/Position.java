package src;

public final class Position {
    private final int x;
    private final int y;

    private Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Ensure only single constructor is used
    public static Position createNewInstance(int x, int y) {
        return new Position(x,y);
    }

    // Getters
    public int getX() { return x; }
    public int getY() { return y; }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x + y
    }

}