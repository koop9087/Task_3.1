import java.util.Scanner;
public class CustomScanner {
    static Scanner scanner = new Scanner(System.in);

    public static String stringLine() {
        String line = scanner.nextLine();
        return line;
    }
}
