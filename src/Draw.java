public abstract class Draw {

    private int shapesCount;

    abstract void drawShape();

    public int getShapesCount() {
        return shapesCount;
    }

    public void incrementShapesCount () {
        shapesCount ++;
    }
}
