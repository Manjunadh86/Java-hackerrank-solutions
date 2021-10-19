package com.company;
import java.util.*;

public class Loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 20 && n >= 2) {
            int i = 1;
            while (i <= 10) {
                int result =n ;
                result = n * i;

                System.out.println(n + " x " + i + " = " + result);
                i++;
            }

        } else
            System.out.println("error");
    }
}
