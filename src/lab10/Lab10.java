package lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab10 {
    public static void main(String[] args) {
        String base = "sdadaaaaaa";
        String a = "a";
        List<String> list = new ArrayList<>();
        list.add("StroKA");
        list.add("DaLsHe");
        list.add("Selo");
        list.add("StroKA");
        var list1 = list.stream().reduce(((x, y)->x + " " + y));
        if (list1.isPresent()){
            var b = list1.get();
            List list2 = Arrays.asList(b.split(""));
            System.out.println(list2.stream().filter(x-> x.equals(a)).count());
        }

        //List list1 = Arrays.asList(base.split(""));
        //String a = "a";
        //System.out.println(list1.stream().filter(x-> x.equals(a)).count());

    }
}
