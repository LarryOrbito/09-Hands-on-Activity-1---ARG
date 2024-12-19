public class Square extends Rectangle {
    @Override
    public void showDescription() {
        super.showDescription(); // Call the superclass method
        System.out.println(" - has 4 equal sides");
    }
}