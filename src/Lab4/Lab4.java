package Lab4;
import java.util.Arrays;
public class Lab4 {
    public static void checkAnagram(String a, String b){
        String first = a.toLowerCase().trim();
        String second = b.trim().toLowerCase();

        char[] chars1 = first.toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = second.toCharArray();
        Arrays.sort(chars2);

        if(Arrays.equals(chars1, chars2)){
            System.out.println("Anograms");
        }else{
            System.out.println("Not anograms");
        }
    }
}
