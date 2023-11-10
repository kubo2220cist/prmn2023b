package lecture02;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner scan = new Scanner(System.in);
        Keisan ksn = new Keisan();

        for(int i=0;i<5;i++){
            System.out.print("数字"+(i+1)+"つ目:");
            num[i] = scan.nextInt();
        }

        int x = ksn.totalAddition(num);
        ksn.dicision(x);
    }
}
