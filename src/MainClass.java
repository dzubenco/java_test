public class MainClass {

    public static void main(String[] args) {
        CircleDrawer drawerC = new CircleDrawer();
        TriangleDrawer drawerT = new TriangleDrawer();

        System.out.println("Number of circles before drawing: " + drawerC.getShapesCount());
        System.out.println("Number of triangles before drawing: " + drawerT.getTrianglesCount());

        drawerC.drawShape();
        drawerC.drawShape();
        drawerC.drawShape();
        drawerC.drawShape();
        drawerT.drawShape();
        drawerT.drawShape();

        System.out.println("Number of circles after drawing: " + drawerC.getShapesCount());
        System.out.println("Number of triangles after drawing: " + drawerT.getTrianglesCount());

    }
}
