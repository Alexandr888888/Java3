public class VigenenerCipher {
    final class Vigenener {


   // public static void main(String[] args) {

        //final class Vigenener {
            private final int bias,
                    letters;


            public Vigenener(final int bias, final int letters) {
                this.bias = bias;
                this.letters = letters;
            }


            public String encrypt(final String text, final String key) {
                String encrypt = "";
                final int keyLen = key.length();
                for (int i = 0, len = text.length(); i < len; i++) {
                    encrypt += (char) (((text.charAt(i) + key.charAt(i % keyLen) - 2 * this.bias) % this.bias) % this.letters) + this.bias;

                }
                return encrypt;
            }


        //public static void main(String[] args){
        //final String key = "en";
        //final Vigenener v = new Vigenener(97, 26);
        //String enc = v.encrypt("english", key);
    //}
            public String decrypt(final String cipher, final String key) {
            String decrypt = "";

            final int keyLen = key.length();
            for (int i = 0, len = cipher.length(); i < len; i++) {
            decrypt += (char) ((cipher.charAt(i) - key.charAt(i % keyLen) + this.letters) % this.letters) + this.bias;
        }
        return decrypt;
    }





             //public static void main(String[] args) {
            final String key = "en";
            Vigenener v = new Vigenener(97, 26);
            final String enc = v.encrypt("english", key);

            {

                System.out.println(enc);
                String dec = v.decrypt(enc, key);
                System.out.println(dec);
                System.out.println((int) 'a');
                System.out.println((int) 'z');

            }
        }


    }