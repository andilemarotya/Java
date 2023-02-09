package Core.Java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){

        List<Integer> arrayList = new ArrayList<Integer>(5);

        for (int i=1 ; i<5 ; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        //Remove element at index 3
        arrayList.remove(3);
        System.out.println(arrayList);
    }
}
