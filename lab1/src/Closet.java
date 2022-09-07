public abstract class Closet implements Furniture{
    @Override
    public void open() {
        System.out.println("Closet is opened!");
    }

    @Override
    public void close() {
        System.out.println("Closet is closed!");
    }
}
