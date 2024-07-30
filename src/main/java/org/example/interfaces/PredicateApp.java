package org.example.interfaces;

import org.example.model.Product;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateApp {

    private void m1(){
        Predicate<Integer> checkAge = (x -> x >= 18);
        Predicate<String>  checkChars = x -> x.length() >= 5;
        Function<Boolean, String> checkMesagge = x -> x ? "Es mayor a 5": "Es menor a 5";


        boolean result = checkAge.test(33);
        boolean result2 = checkChars.test("Extremadado");
        String result3 = checkMesagge.apply(result2);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }


    private void m2(){
        Predicate<Integer> greaterThan = x -> x > 10;
        Predicate<Integer>  lowThan = x -> x < 20;

        boolean result = greaterThan.and(lowThan).test(33);

        System.out.println(result);
    }

    private void m3 (Product product, Predicate<Product> fx){
        boolean result = fx.test(product);
        System.out.println(result);
    }

    public static void main(String[] args) {

        PredicateApp app = new PredicateApp();
        //app.m1();
        Predicate<Product> f1 = x -> x.getName().length() >= 3;
        app.m3(new Product(1,"TV"),f1);

    }

}
