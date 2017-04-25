package com.company;

public class Main {

    public static int N = 9000;

    public static void main(String[] args) {

        long time_start, time_end;
        time_start = System.currentTimeMillis();
        calculSenseOptimitzar();// llamamos a la tarea
        time_end = System.currentTimeMillis();

        System.out.println("La tasca sense optimitzar a trigat "+ ( time_end - time_start ) +" millisegonds");

        long time_start2, time_end2;
        time_start2 = System.currentTimeMillis();
        calculOptimitzat();// llamamos a la tarea
        time_end2 = System.currentTimeMillis();

        System.out.println("La tasca optimitzada a trigat "+ ( time_end2 - time_start2 ) +" millisegonds");
    }

    public static void calculSenseOptimitzar(){

        int i, sum = 0;
        for (i = 1; i <= N; ++i) {
            sum += i;
        }

        System.out.println("sum: %d\n" + sum);
    }


    public static void calculOptimitzat(){

        int sum = N * (1 + N) / 2;
        System.out.println("sum: %d\n" + sum);
    }
}
