package lesson02;

public class EveryNth {
    public static void main(String[] args) {

        eachNumber("Looks like I have done :)", 3);

    }

    static void eachNumber(String text, int peroid) {
        System.out.println(text);
        char[] charArray = text.toCharArray();
        //System.out.print(charArray[0]);

        for (int i = 0; i < charArray.length; i++) {
            if ((i + 1) % peroid == 0 || i == 0) {
                System.out.print(charArray[i]);
            } else {
            }
        }
    }

}




