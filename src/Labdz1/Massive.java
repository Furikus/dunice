package Labdz1;

import java.util.stream.IntStream;


public class Massive {


    public static void main(String[] args) {
        int num = 6;
        int[] input = { 2, 4, 3, 3 };

        IntStream.range(0, input.length)
                .forEach(i -> IntStream.range(0,  input.length)
                        .filter(j -> i != j && input[i] + input[j] == num)
                        .forEach(j -> addPairs(input[i], input[j]))
                );
    }

    private static void addPairs(int i, int i1) {
        System.out.println("{" + i + "," + i1 + "}");
    }

}
