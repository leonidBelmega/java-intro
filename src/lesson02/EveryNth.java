package lesson02;

public class EveryNth {
    public static void main(String[] args) {

        eachNumber("Miracle", 2);
        eachNumber("abcdefg", 2);
        eachNumber("abcdefg", 3);


    }

    static void eachNumber(String text, int everyNth) {
        System.out.println(text);
        char[] charArray = text.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (i % everyNth == 0 || i == 0) {
                System.out.print(charArray[i]);
            } else {
            }
        }
        System.out.println();

    }

}