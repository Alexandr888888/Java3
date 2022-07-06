import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        menu();
    }


       public static String getRandomString ( int length){


           String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
           Random random = new Random();
           StringBuffer sb = new StringBuffer();
           for (int i = 0; i < length; i++) {
               int number = random.nextInt(52);
               sb.append(str.charAt(number));
           }


           return sb.toString();
       }


        public  void caesar () {

        }

        String text ="BOMB";
        String cipher = Caesar.encrypt(text, 5);
        {


            System.out.println(cipher);
        }
         //public void caesarDecode () {


        String getDecode = "Anafy";
        String decode = CaesarDecode.decrypt(text, 5);
        {
            System.out.println(decode);
        }
        public void vigener () {
            String cipher = "";
           // if(Character.isUpperCase(intShift))
         //    String text2 = vigener.encrypt(text,5);
            {
                System.out.println(cipher);
            }

        }
        static void menu() {
            Scanner in = new Scanner(System.in);

            System.out.println("Menu:");
            System.out.println("1) Encrypt caesar");
            System.out.println("2) Decrypt caesar");
            System.out.println("3) Encrypt vigener");
            System.out.println("4) Decrypt vigener");
            System.out.print("Your variant:");

            switch (in.nextInt()) {
                case 1:
                    String cipher = "Vivat";
                    System.out.println(Caesar.encrypt(cipher, 5));
                    menu();
                    break;
                case 2:
                    String encryptMessage = ("Anafy");
                    System.out.println(CaesarDecode.decrypt(encryptMessage, 5));
                    menu();
                    break;
                case 3:
                    String vigener = "Vivat";
                    char shift = 'G';
                    int intShift = (int) shift - 65;
                    if (Character.isUpperCase(intShift))
                        shift = (char) (int) (intShift);
                    System.out.println(Caesar.encrypt(vigener, intShift));
                    menu();
                    break;
                default:

                case 4:
                    String encryptVigenerMessage = ("Bobgz");
                    char decryptShift = 'G';

                    int intDecryptShift = (int) decryptShift - 65;
                    System.out.println(CaesarDecode.decrypt(encryptVigenerMessage, intDecryptShift));


                    menu();

                    break;
            }
        }
          //public static String getRandomString ( int length){


               // String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
               // Random random = new Random();
               // StringBuffer sb = new StringBuffer();
               // for (int i = 0; i < length; i++) {
                    //int number = random.nextInt(52);
                  // sb.append(str.charAt(number));
               // }


              //  return sb.toString();
            }

