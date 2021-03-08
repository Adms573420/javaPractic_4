import java.util.Scanner;

public class Questions_6 {
    public static void main(String[] args) {
        //Klavyeden
        //girilen bir integer sayıyı tersten yazan program
        //İnput: 4981
        //Output:
        //1894
        Integer sayı;
            Scanner scanner= new Scanner(System.in);
            System.out.print("Bir sayı giriniz:");
            sayı = scanner.nextInt();

            String str=sayı.toString();

        for (int i = str.length()-1 ; i >=0 ; i--) {
            System.out.print
                    (str.charAt(i));
        }

    }
}

