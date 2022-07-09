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


        static void menu () {

            System.out.println("Введите слово:");
            Scanner in = new Scanner(System.in);
            String randomWord = in.nextLine();
            System.out.println("Menu:");
            System.out.println("1) Encrypt caesar");
            System.out.println("2) Decrypt caesar");
            System.out.println("3) Encrypt vigener");
            System.out.println("4) Decrypt vigener");
            System.out.print("Your variant:");

            switch (in.nextInt()) {
                case 1:
                    String sim = getRandomString(52);

                    if (Character.isLetter(sim.charAt(1))) ;
                    String cipher = randomWord;
                    System.out.println(Caesar.encrypt(cipher, 5));

                    menu();
                    break;
                case 2:
                    String decode = getRandomString(52);
                    if (Character.isLetter(decode.charAt(1))) ;
                    String encryptMessage = randomWord;
                    System.out.println(CaesarDecode.decrypt(encryptMessage, 5));
                    menu();
                    break;
                case 3:
                    String code = getRandomString(52);
                    if (Character.isLetter(code.charAt(1))) ;
                    String vigener = randomWord;
                    char shift = 'G';
                    int intShift = (int) shift - 65;

                    System.out.println(Caesar.encrypt(vigener, intShift));
                    menu();
                    break;

                case 4: String vigenerDecode = getRandomString(52);
                    if (Character.isLetter(vigenerDecode.charAt(1))) ;
                    String encryptVigenerMessage = randomWord;
                    char decryptShift = 'G';

                    int intDecryptShift = (int) decryptShift - 65;
                    System.out.println(CaesarDecode.decrypt(encryptVigenerMessage, intDecryptShift));


                    menu();

                    break;
                default:
            }    }
        }


