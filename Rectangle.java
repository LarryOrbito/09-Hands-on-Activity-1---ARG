public class Rectangle extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription(); // Call the superclass method
        System.out.println(" - has 4 right angles");
    }
}