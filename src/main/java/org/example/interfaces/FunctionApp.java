package org.example.interfaces;

import org.example.model.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionApp {

    private void m1(){

        Function<String,Integer> fx = x -> x.length();
        int result = fx.apply("mitocode");

        System.out.println(result);

    }

    private  void m2AndThen(){
        Function<String, Integer> fx1 = x -> x.length();
        Function<Integer, Integer> fx2 = x -> x +10;

        Integer result = fx1.andThen(fx2).apply("mitocode");
        System.out.println(result);

    }

    private  void m2AndThenV2(){
        Function<Integer, Integer> fx1 = x -> x * 2;
        Function<Integer, Integer> fx2 = x -> x +10;

        Integer result = fx1.andThen(fx2).apply(5);
        System.out.println(result);

    }

    private  void m2AndThenV3(){
        Function<Integer, Integer> fx1 = x -> x * 2;
        Function<Integer, Integer> fx2 = x -> x +10;

        Integer result = fx1.compose(fx2).apply(5);
        System.out.println(result);

    }

    private void m4Identity(){
        Function<Employee, Employee> fx1 = Function.identity();

        System.out.println(fx1.apply(new Employee()));

    }

    private void m5Identity(){
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "mito1", "teacher", LocalDate.now(), 499.0, "TI"));
        list.add(new Employee(2, "mito2", "teacher", LocalDate.now(), 500.0, "TI"));
        list.add(new Employee(3, "mito3", "teacher", LocalDate.now(), 400.0, "QA"));

        Map<Integer, String> map= list.stream().collect(Collectors.toMap(e -> e.getIdEmployee() , e -> e.getName()));

        System.out.println(map);

    }

    private void m6Identity(){
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "mito1", "teacher", LocalDate.now(), 499.0, "TI"));
        list.add(new Employee(2, "mito2", "teacher", LocalDate.now(), 500.0, "TI"));
        list.add(new Employee(3, "mito3", "teacher", LocalDate.now(), 400.0, "QA"));

        Map<Integer, Employee> map= list.stream().collect(Collectors.toMap(e -> e.getIdEmployee() , t -> t));

        System.out.println(map);

    }

    private void m7Identity(){
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "mito1", "teacher", LocalDate.now(), 499.0, "TI"));
        list.add(new Employee(2, "mito2", "teacher", LocalDate.now(), 500.0, "TI"));
        list.add(new Employee(3, "mito3", "teacher", LocalDate.now(), 400.0, "QA"));

        Map<Integer, Employee> map= list.stream().collect(Collectors.toMap(Employee::getIdEmployee , t -> t));

        System.out.println(map);

    }

    private void m8Identity(){

        Function<Integer, Integer> f1 = Function.identity();
        Function<Integer, Integer> f2 = Function.identity();
        Function<Integer, Integer> f3 = Function.identity();

        Function<Integer, Integer> f4 = t -> t;
        Function<Integer, Integer> f5 = t -> t;
        Function<Integer, Integer> f6 = t -> t;

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println("============================");
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);

    }

    public static void main(String[] args) {

        FunctionApp app = new FunctionApp();
        app.m8Identity();

    }

}
