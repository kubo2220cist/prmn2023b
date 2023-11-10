package lecture02;
import java.util.Scanner;

public class pra2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("氏名:");
        String name = input.next();
        System.out.print("学籍番号：");
        int num = input.nextInt();

        System.out.println("氏名:"+name+ ",学籍番号:b"+num);
    }
}
