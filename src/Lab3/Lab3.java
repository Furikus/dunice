package Lab3;
import  java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {

    }
    public static void password(String password) {
        //System.out.println("Введите ваш парольчик пожалуйста");
        Scanner scanner = new Scanner(System.in);
        //String password = scanner.nextLine();
        String repeatPass;
        System.out.println("Введите ваш парольчик снова пожалуйста");
        do {
            repeatPass = scanner.nextLine();
            if (repeatPass.equals(password)){
                System.out.println("Вы ввели верный пароль");
            }else{
                System.out.println("Вы ввели неверный пароль");
            }
        }
        while (!repeatPass.equals(password));
    }

}
