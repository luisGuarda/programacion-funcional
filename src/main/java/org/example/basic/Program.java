package org.example.basic;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

       //list.forEach( e -> System.out.println(e) );

        list.forEach( e -> {
            e++;
            System.out.println(e);
        });

    }

}
