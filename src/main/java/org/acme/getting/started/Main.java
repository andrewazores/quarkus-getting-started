package org.acme.getting.started;

import java.util.Arrays;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        System.out.print("properties: ");
        System.getProperties().list(System.out);
        System.out.print("args: ");
        System.out.println(Arrays.asList(args));
        Quarkus.run(args);
    }
}
