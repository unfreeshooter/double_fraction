package ru.stepup.payments;

import static java.lang.Integer.sum;

public class Start {
    public static void main(String[] args) {
        int num = sum(2, 3);
        num = sum(num, 5);
        System.out.println(num);
    }

        public static int sum(int a, int b){
            int res=a+b;
            return res;
    }
}