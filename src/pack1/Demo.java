package pack1;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(null);
        set.add(11);
        set.add(33);
        set.add(43);
        //System.out.println(set);
        set.add(53);
        System.out.println(set);
        set.add(33);
        set.add(83);
        for(Integer i :set){
            System.out.println(i);
        }
    }
}
