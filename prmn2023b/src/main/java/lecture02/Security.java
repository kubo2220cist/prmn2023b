package lecture02;
import java.util.Scanner;
public class Security {
    String[][] id = {{"b2220000","pwd1"},
            {"b2220001","pwd2"},
            {"b2220002","pwd3"},
            {"b2220003","pwd4"},
            {"b2220870","KuboT"}};
    Scanner input = new Scanner(System.in);
    void studentNo(){
        System.out.print("学籍番号を入力:");
        String studentNumber = input.next();

        for(int i=0;i<5;i++){
            if(studentNumber.equals(id[i][0])){
                this.password();
            }
        }
        System.out.println("error!!");
        System.exit(0);
    }

    void dicision(){

    }

    void password(){
        System.out.print("パスワードを入力:");
        String studentNumber = input.next();

        for(int i=0;i<5;i++){
            if(studentNumber.equals(id[i][1])){
                System.out.println("ログイン完了");
                System.exit(0);
            }
        }
        System.out.println("不正なアクセス");
        System.exit(0);
    }
}
