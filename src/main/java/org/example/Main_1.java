package org.example;

import java.util.Scanner;

public class Main_1 {



    /**
     */
    public static void main(String[] args) {
        //⦁	Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число

        int a;
        int b;
        int sum=0;
        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            b = scanner.nextInt();
            if ((b%10 == 5) && (a%2 == 0))
        }

        System.out.println("result " +);

    }
}