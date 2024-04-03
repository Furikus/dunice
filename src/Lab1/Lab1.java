package Lab1;

public class Lab1 {
    public static void main(String[] args) {

    }
    public static void prosto(int firstNum , int secondNum) {
        boolean check = true;

        for(int i = firstNum; i <= secondNum; i++){
            for(int j = 2; j < i;j++){
                if (i % j == 0){
                    check = false;
                    break;
                }
            }
            if (check) System.out.println(i);
            else check = true;
        }
    }

}