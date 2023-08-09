import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius:  ");
        int radius = scanner.nextInt();
        System.out.print("Area:  ");
        circle.area(radius);

        System.out.print("Длина окружности: ");
        circle.circumference(radius);
    }
}


