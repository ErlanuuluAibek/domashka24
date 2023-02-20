import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>integers=new HashSet<>();
        integers.add(2);
        integers.add(4);
        integers.add(1);
        integers.add(5);
        Set<Integer>integers1=new HashSet<>();
        integers1.add(1);
        integers1.add(6);
        integers1.add(4);
        integers1.add(7);
        System.out.println(symmetricDifference(integers,integers1));
    }
    public static Set<Integer>symmetricDifference(Set<Integer>set1,Set<Integer>set2){
        Set<Integer> set= new HashSet<>(set1);
        set.addAll(set2);
        Set<Integer> integers=new HashSet<>(set1);
        integers.retainAll(set2);
        set.removeAll(integers);
        return set;
    }
}