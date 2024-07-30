package org.example.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerApp {

    public void m1(){

        Consumer<String> fx1= x -> System.out.println(x);

        fx1.accept("Hello");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.forEach( e -> System.out.println(e));

    }

    public void m2(){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Consumer<Integer> consumer = x ->{
            x++;
            System.out.println(x);
        };

        list.forEach(consumer);

    }

    public static void main(String[] args) {

       ConsumerApp app = new ConsumerApp();
       app.m2();

    }

}
