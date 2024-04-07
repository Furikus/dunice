package lab7;

import java.util.ArrayList;
import java.util.List;

public class LAb7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(3);
        list.add(444);
        list.add(532);
        list.add(-100);
        System.out.println(list.stream().min(Integer::compare).get());
        System.out.println(list.stream().max((m,n)->Integer.compare(m,n)).get());
    }
}
