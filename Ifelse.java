package com.company;
import java.util.*;

public class Ifelse {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        if (num % 2 == 0){
            if (num <= 5){
                System.out.println("Not Weird");
            } else if (num <= 20 && num >= 6){
                System.out.println("Weird");
            } else if (num > 20){
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }
    }
}
