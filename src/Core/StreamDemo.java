import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args){
        List<Integer> numberList = new ArrayList<>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);

        //use stream instead of loops to save memory
        // List<Integer> squareList = new ArrayList<>();
        // for (Integer i: numberList){
        //     squareList.add(i*i);
        // }

        //Using streams
        List<Integer> squareList = numberList.stream().map(x -> x*x).collect(Collectors.toList());
    }
}
