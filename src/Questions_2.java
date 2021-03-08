import java.util.Scanner;

public class Questions_2 {
    public static void main(String[] args) {
     //You can do it !
        Scanner scan=new Scanner(System.in);
        System.out.println("İsmi gir;  ");

        String name=scan.nextLine();
        String str= "You can do it !";

        System.out.println(str.replaceAll("!",name));
    }
}
