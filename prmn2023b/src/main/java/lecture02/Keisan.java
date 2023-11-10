package lecture02;

public class Keisan {
    int totalAddition(int array[]){
        int sum = 0;
        for(int i=0;i<5;i++){
            sum += array[i];
        }
        return sum;
    }

    int dicision(int n){
        if(n>=100){
            System.out.println("great!!");
        }else if(n>=50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
        return 0;
    }
}
