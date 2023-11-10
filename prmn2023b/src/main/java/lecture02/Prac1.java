package lecture02;
import java.util.Scanner;
public class Prac1 {
    public static void main(String[] args) {
        String Number = "B2220870";

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力:");
        String gakuseki = scan.next();

        Gakuseki guk = new Gakuseki();
        guk.dicision(Number,gakuseki);
    }
}
