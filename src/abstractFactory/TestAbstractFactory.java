package abstractFactory;

public class TestAbstractFactory {

    public static void main(String[] args){
        AbstractFactory factory1 = FactoryProducer.getFactory(true);
        AbstractFactory factroy2 = FactoryProducer.getFactory(false);

        Shape shape1 = factory1.getShape("Square");
        shape1.draw();

        Shape shape2 = factory1.getShape("Triangle");
        shape2.draw();

        Shape shape3 = factroy2.getShape("Square");
        shape3.draw();

        Shape shape4 = factroy2.getShape("Triangle");
        shape4.draw();
    }

}
