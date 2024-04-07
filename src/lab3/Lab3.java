package lab3;

import java.util.ArrayList;
import java.util.List;

public class Lab3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        var res = list.stream().mapToDouble(Integer::doubleValue).average();
        //List.of(list.stream().filter(x -> x % 2 == 0).reduce(0, ( sum, x )-> sum = sum + x)).forEach(System.out::println);
        //list.stream().filter(x -> x % 2 == 1).reduce(0, ( sum, x )-> sum = sum + x);
        //System.out.println(list.stream().reduce(0, ( sum, x )-> sum = sum + x));

    }
}
