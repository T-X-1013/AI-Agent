package com.tao.taoaiagent.advisor;

import java.util.Scanner;

public class test {

    public static int work(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int b = sc.nextInt();
        System.out.println(b);
        int a  = test.work(s);
        System.out.println(a);
    }
}



