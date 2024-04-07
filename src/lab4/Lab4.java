package lab4;

import java.util.ArrayList;
import java.util.List;

public class Lab4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("StroKA");
        list.add("DaLsHe");
        list.add("Selo");
        list.add("Svadba");
        //list.stream().filter(x-> x.startsWith("S")).count();
        System.out.println(list.stream().filter(x-> x.startsWith("D")).count());
    }
}
