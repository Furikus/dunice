package lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lab8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(3);
        list.add(444);
        list.add(532);
        list.add(-100);

        System.out.println(list.stream().sorted().filter(x-> x > list.indexOf(0)).toList().getFirst());
        //System.out.println(list.stream().max((m,n)->Integer.compare(m,n)).get());
    }
}
