public class Main {
    public static void main(String[] args) {
        String choice = CustomScanner.stringLine();
        Printer.print(Finder.changingLine(choice));
    }
}
