package Core.Java;

import java.util.*;
public class HashSetDemo {
    public static void main(String[] args){

        HashSet<String> hashSet = new HashSet<>(/*Here we allocate the size */);  // can write Set<String>

        hashSet.add("A");
        hashSet.add("B");
        boolean r1 = hashSet.add("C");
        System.out.println(r1);

        boolean r2 = hashSet.add("C");
        System.out.println(r2);
        hashSet.add("D");

        System.out.println(hashSet);



    }
}
