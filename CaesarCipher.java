import java.util.Scanner;

public class CaesarCipher {

    public static StringBuffer encrypt(String text, int s){
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i)))
            {
                int ascii = (text.charAt(i) + s);
                if(ascii > 90) ascii -= 26;
                result.append((char) ascii);
            }
            else if(Character.isLowerCase(text.charAt(i)))
            {
                int ascii = (text.charAt(i) + s);
                if(ascii > 122) ascii -= 26;
                result.append((char) ascii);
            } else {
                result.append(text.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int num = input.nextInt() % 26;
        System.out.println(encrypt(text, num));
    }
}
