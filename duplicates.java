
import java.util.HashSet;

public class duplicates {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 2, 4, 5, 1};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        System.out.println("Array after removing duplicates: " + set);
    }   
}
