package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

    public static void main(String[] args) {

        List<String> list = List.of("Aman", "Akshay","Rajendra","Ankit");
        List<String> newNames = list.stream().filter(e-> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

//        newNames.stream().forEach(System.out::println);

        List<Integer> numbers = List.of(15,14,12,11);
        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNumbers);

//        numbers.stream().sorted().forEach(System.out::println);

        Integer integer = numbers.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("min " + integer);

        Integer integer1 = numbers.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("max " + integer1);
    }
}
