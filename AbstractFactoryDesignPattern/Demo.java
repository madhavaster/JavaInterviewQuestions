package AbstractFactoryDesignPattern;

public class Demo {
    public static void main(String[] args) {
        // factory pattern: hiding the details of object creation
        // abstract factory pattern: hiding the details of the factory creation itself.
        // xml, db,
        // emp, dept
        DaoAbstractFactory abstractFactory = DaoFactoryProducer.produce("xml");
        Dao dao = abstractFactory.createDao("emp");
        dao.save();
    }
}
