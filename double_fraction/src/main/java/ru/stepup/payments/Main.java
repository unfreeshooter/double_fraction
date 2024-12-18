package ru.stepup.payments;
/*
Необходимо реализовать метод таким образом, чтобы он возвращал только дробную часть числа х.
При выводе результата необходимо обеспечить точность вычислений — три знака после запятой
Подсказка: вещественное число может быть преобразовано к целому путем отбрасывания дробной части.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(fraction(7.333));
        System.out.println(fraction(-8));
        System.out.println(fraction(0.55));
        }
    public static double fraction(double x){
        double fraction = x - (long) x;
        double rounded = Math.round(fraction * 1000.0) / 1000.0;
        return rounded;
}
}