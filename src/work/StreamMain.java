package work;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(2,4,55,50,6,43,32,98,8,7);
//        list.add(45);

        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(22);
        list.add(10);
        list.add(17);
        list.add(12);

        // without StreamAPI
       List<Integer> listEven = new ArrayList<>();

       for(int i: list1){

           if(i % 2 ==0){
               listEven.add(i);
           }
       }

        System.out.println(list1);
        System.out.println(listEven);

        // using Stream

        List<Integer> newList = list1.stream().filter(i ->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1 = list1.stream().filter(i -> i > 50).collect(Collectors.toList());
        System.out.println(newList1);
    }
}
