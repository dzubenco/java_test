public class TriangleDrawer extends Draw {



    @Override
    public void drawShape() {
        System.out.println("Drawing a triangle!");
        super.incrementShapesCount();
    }

    public int getTrianglesCount() {
        return super.getShapesCount();
    }

}
