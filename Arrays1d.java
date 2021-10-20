package com.company;

import java.util.Scanner;
import java.util.*;

public class Arrays1d {
    public static void main(String[] args) {




            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            int[] a = new int[n];
            for (int k = 0; k<n; k++) {
                a[k] = scan.nextInt();
            }
            scan.close();

            // Prints each sequential element in array a
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }

