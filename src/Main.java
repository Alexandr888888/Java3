public class Main {

public static void  main (String[] args) {
    String text = "Vivat";
    String cipher = new encrypt(text, 5);
    System.out.println(cipher);
}
public static void cipherDecrypt() {

    String text = "Vivat";
    String cipher = new decrypt(text, 5);
    {
        System.out.println(cipher);
    }
    public static void codeDecodeVigenener() {
    final String key = "en";
    Vigenener v = new Vigenener(97, 26);


    final String enc = v.encrypt("english", key);
    {


    System.out.println(enc);
    String dec = v.decrypt(enc, key);
    System.out.println(dec);
    System.out.println((int) 'a');
    System.out.println((int) 'z');
}  } } }