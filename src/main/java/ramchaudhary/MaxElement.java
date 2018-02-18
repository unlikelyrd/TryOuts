package ramchaudhary;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxElement {

    public static void main(String[] args) {

      List<Integer> li = Arrays.asList(3,4,8,8,11,15,18,32);
 //       List<Double> li = Arrays.asList(1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8);

  //   List<String> li = Arrays.asList("Apple","Orange","Banana","Pearl");

        System.out.printf("Maximum element in the list is " + maximum(li,0,8));

    }

    public static <T extends Comparable<? super T>> T maximum (List<T> list, int begin, int end) {


        return list.subList(begin, end).stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(IndexOutOfBoundsException:: new);

    }


}
