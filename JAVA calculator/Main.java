package com.packages;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variables
        int num1;
        int num2;
        String sign;
        // 3 inputs
        Scanner num1inp = new Scanner(System.in);
        System.out.print("enter num 1 = ");
        num1 = num1inp.nextInt();
        Scanner signinp = new Scanner(System.in);
        System.out.println("Enter sign  = ");
        sign = signinp.next();
        Scanner num2inp = new Scanner(System.in);
        System.out.print("enter num 2 = ");
        num2 = num2inp.nextInt();
        // if statements to filter out the sign input into arithmetic sign

        if (Objects.equals(sign, "+")) {
            int ans = num1 + num2;
            System.out.println("your ans " + ans);
        } else if (Objects.equals(sign, "-")) {
            int ans = num1 - num2;
            System.out.println("your ans " + ans);
        } else if (Objects.equals(sign, "/")) {
            System.out.println("your ans " + num1 / num2);
        } else if (Objects.equals(sign, "*")) {
            System.out.println("your ans " + num1 * num2);
        } else {
            System.out.println("INVALID SIGN error #12284799");
        }
    }
}



