package com.company;

import java.util.Scanner;

public class coordinate3 {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double x = in.nextDouble();
            if ((-2 <= x && x <= 3) || (6 <= x && x <= 9))
                System.out.println(false);
            else
                System.out.println(true);
    }
}
