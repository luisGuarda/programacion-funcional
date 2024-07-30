package org.example.interfaces;

import java.time.LocalDate;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierApp {

    private void m1(){
        Supplier<LocalDate> fx = () -> LocalDate.now().minusDays(1);
        LocalDate date = fx.get();
        System.out.println(date);

        Supplier<String> generatePassword = () -> UUID.randomUUID().toString();
        String password = generatePassword.get();
        System.out.println(password);

    }

    public static void main(String[] args) {

        SupplierApp app = new SupplierApp();
        app.m1();

    }

}
