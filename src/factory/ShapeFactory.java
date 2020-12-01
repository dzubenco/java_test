package factory;

public class ShapeFactory {


    public Shape getShape (String type) {
        if (type == "Circle") {
            return new Circle();
        }
        else if (type == "Triangle") {
            return new Triangle();
        }
        else return null;
    }
}
