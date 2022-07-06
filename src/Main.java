import java.util.Scanner;

public class Main {


        public static void main (String[] args) {
                   menu();
   }
        public  void Caesar () {

        String text = "Vivat";
        String cipher = Caesar.encrypt(text, 5);
        {


            System.out.println(cipher);
        }
        // public void CaesarDecode () {


        //String text = "Anafy";
        String decode = CaesarDecode.decrypt(text, 5);
        {
            System.out.println(decode);
        }
    }
        public void Vigenener2 () {
            String cipher = "vivat";
             String text2 = Vigenener2.encrypt(text,5);
            {
                System.out.println(cipher);
            }

        }
        static void menu() {
            Scanner in = new Scanner(System.in);

            System.out.println("Menu:");
            System.out.println("1) Encrypt caesar");
            System.out.println("2) Decrypt caesar");
            System.out.println("3) Encrypt vigenener");
            System.out.println("4) Decrypt vigenener");
            System.out.print("Your variant:");

            switch (in.nextInt()) {
                case 1:
                    Caesar.encrypt();
                    menu();
                    break;
                case 2:
                    CaesarDecode.decrypt();
                    menu();
                    break;
                case 3:
                    Vigenener2.encrypt();
                    menu();
                    break;
                default:
                    break;
            }


        }     }