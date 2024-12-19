import java.util.Scanner;

public class RunQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press R for Rectangle, S for Square, P for Parallelogram, H for Rhombus, T for Trapezoid: ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'R':
                Rectangle rectangle = new Rectangle();
                rectangle.showDescription();
                break;
            case 'S':
                Square square = new Square();
                square.showDescription();
                break;
            case 'P':
                Parallelogram parallelogram = new Parallelogram();
                parallelogram.showDescription();
                break;
            case 'H':
                Rhombus rhombus = new Rhombus();
                rhombus.showDescription();
                break;
            case 'T':
                Trapezoid trapezoid = new Trapezoid();
                trapezoid.showDescription();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}