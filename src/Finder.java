public class Finder {
    public static String changingLine(String choice) {
        char upperCase = 0;
        String camelCase = new String(choice);
        String[] array = camelCase.split("");
        char[] charArray = camelCase.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                upperCase = charArray[i];
            }
        }
        array = camelCase.split("\\p{javaUpperCase}");
        String result1 = array[0] + "_" + upperCase + array[1];
        return result1;
    }
}
