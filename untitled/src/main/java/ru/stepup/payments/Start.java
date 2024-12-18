package ru.stepup.payments;

public class Start {
    public static void main(String[] args) {
        //получаем исходные числа
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);

        //складываем
        int sum=x+y;

        //выводим на экран
        System.out.println(x+" + "+y+" = "+sum);
        }
    }