public class CaesarDecode  {
    public static String decrypt(String plainText, int shift){
        if (shift>26) {
            shift = shift % 26;
        }
        else if (shift<0){
            shift = (shift%26)+26;
        }
        String cipherText = "";
        int length = plainText.length();
        for (int i = 0; i<length; i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch - shift);
                    if (c < 'a') {
                        cipherText += (char) (ch + (26 - shift));

                    } else {
                        cipherText += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch - shift);
                    if (c < 'A') {
                        cipherText += (char) (ch + (26 - shift));

                    } else {
                        cipherText += c;
                    }
                }
            } else {
                cipherText += ch;
            }
        }
        return cipherText;
    }
    public static void  main (String[] args) {
        String text = "Vivat";
        String cipher = decrypt(text, 5);
        System.out.println(cipher);
        //String decrypted = decrypt(cipher,0);
        //System.out.println(decrypted);
    }   }

