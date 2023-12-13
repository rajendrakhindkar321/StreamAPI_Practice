package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Rajendra", "Duegesh", "Prashant","Pravin");
        stream.forEach(e-> System.out.println(e));

        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(5);
        list.add(2);
        list.add(4);

        System.out.println(list);
        Stream<Integer> stream1 = list.stream();
        stream1.forEach(e-> System.out.println(e));
    }
}
