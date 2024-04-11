//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Для данного входного числа верните число в обратном порядке. 3956 ---> 6593
import java.util.Objects;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int leng = String.valueOf(num).length();
        int reverse = 0;

        for (int i = 0; i < leng; i++){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }


        System.out.println(reverse);
    }



}